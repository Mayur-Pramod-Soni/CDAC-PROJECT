package com.sarthi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sarthi.model.User;

@Repository
public interface AdminRepository extends JpaRepository<User , Long> {

	 List<User> findAll();
	 void deleteById(int id);
}
