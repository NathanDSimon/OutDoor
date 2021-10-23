package com.outDoor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.outDoor.models.ODUser;
import com.outDoor.repositories.ODUserRepository;

@Service
public class ODUserService {


	@Autowired
	private ODUserRepository ODuserDAO;
	
	public List<ODUser> getAll() {
		return ODuserDAO.findAll();
	}
	
	public Optional<ODUser> getById(String id) {
		return ODuserDAO.findById(id);
	}
	
	public ODUser create(ODUser user) {
		return ODuserDAO.save(user);
	}
	
	public ODUser update(ODUser user) {
		return ODuserDAO.save(user);
	}
	
	public void delete(String username) {
		ODuserDAO.deleteById(username);
	}
	
	public Optional<ODUser> findByUsername(String Username) {
		return Optional.ofNullable(ODuserDAO.findByUsername(Username));
	}
}
