package com.sarthi.services;

import com.sarthi.model.User;

public interface UserServices {

	//User save(UserRegistrationDto userRegistrationDto);
	public User createUser(User user);
	
	   public boolean checkEmail(String email);


		public boolean checkPassword(String password);

		public User getUserByEmailAndPassword(String email, String password);
}
