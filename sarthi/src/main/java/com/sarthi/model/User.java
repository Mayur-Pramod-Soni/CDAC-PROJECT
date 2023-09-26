package com.sarthi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="city")
	private String city;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(String name, String city, String email, String password, String role) {
		super();
		this.name = name;
		this.city = city;
		this.email = email;
		this.password = password;
		this.role = role;
		/**
		 * 
		 */
		
//		public User() {
//			super();
			// TODO Auto-generated constructor stub
		}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		
		
}
		

	
	