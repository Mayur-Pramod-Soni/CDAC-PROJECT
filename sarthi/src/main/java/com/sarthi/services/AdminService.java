package com.sarthi.services;

import java.util.List;

import com.sarthi.model.User;


public interface AdminService {

	List<User> getAllDetails(); 
	
	void deleteUserById(long id);
}
