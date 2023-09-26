package com.sarthi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarthi.model.User;
import com.sarthi.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
System.out.println(user.getPassword());
		
		user.setRole("Tourist");
		return userRepository.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.existsByEmail(email);	}

	@Override
	public boolean checkPassword(String password) {
		// TODO Auto-generated method stub
		return userRepository.existsByPassword(password);
	}

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		Optional<User> userOptional = userRepository.findByEmailAndPassword(email, password);
        return userOptional.orElse(null);
	}

}
