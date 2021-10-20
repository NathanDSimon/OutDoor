package com.outDoor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.outDoor.models.ODUser;

public interface ODUserRepository extends JpaRepository<ODUser, String> {
	
	
	
}