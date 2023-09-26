package com.sarthi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sarthi.model.User;
import com.sarthi.repository.UserRepository;

@Service
public class UserDeatilsServiceImp implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User user=userRepo.findByEmail(email);
		
		if(user !=null)
		{
			return new CustomerUserDetails(user);
		}
		
		throw new UsernameNotFoundException("User not Avialable");
	}
	

}
