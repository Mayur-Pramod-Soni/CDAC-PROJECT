package com.sarthi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarthi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {

	
	public boolean existsByEmail(String email);
	
	public User findByEmail(String email);

	public boolean existsByPassword(String password);

	public Optional<User> findByEmailAndPassword(String email, String password);

}

