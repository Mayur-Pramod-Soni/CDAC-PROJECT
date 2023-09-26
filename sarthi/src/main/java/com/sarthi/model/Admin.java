package com.sarthi.model;

public class Admin {
   private String userName="Admin";
   
   private String password="Admin";

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Admin [userName=" + userName + ", password=" + password + "]";
}
    
}
