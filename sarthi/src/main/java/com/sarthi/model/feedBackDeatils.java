package com.sarthi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class feedBackDeatils {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "feedback")
	private String feedback;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	@Override
	public String toString() {
		return "feedBackDeatils [id=" + id + ", name=" + name + ", email=" + email + ", feedback=" + feedback + "]";
	}


	



}
