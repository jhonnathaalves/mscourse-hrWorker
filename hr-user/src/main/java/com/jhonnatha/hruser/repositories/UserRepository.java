package com.jhonnatha.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonnatha.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
