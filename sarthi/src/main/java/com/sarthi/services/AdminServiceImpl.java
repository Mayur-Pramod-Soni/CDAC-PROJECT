package com.sarthi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarthi.model.User;
import com.sarthi.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	
	@Override
	public List<User> getAllDetails() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}



	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(id);
	}
	


}
