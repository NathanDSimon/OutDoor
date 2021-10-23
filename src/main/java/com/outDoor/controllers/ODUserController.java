package com.outDoor.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.outDoor.models.ODUser;
import com.outDoor.services.ODUserService;

@RestController
@RequestMapping("/user")
public class ODUserController {

	@Autowired
	private ODUserService oduserService;

	@GetMapping
	public ResponseEntity<List<ODUser>> findAll() {
		return ResponseEntity.ok(oduserService.getAll());
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<ODUser> findByUsername(@PathVariable("username") String username) {
		Optional<ODUser> optional = oduserService.findByUsername(username);
		
		if(optional.isPresent()) {
			return ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@PostMapping("/new")
	public ResponseEntity<ODUser> create(@RequestBody ODUser oduser) {
		Optional<ODUser> newuser = oduserService.findByUsername(oduser.getUsername());
		if(newuser.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		
		return ResponseEntity.ok(oduserService.create(oduser));
	}
	
	@DeleteMapping("/delete/{username}")
	public ResponseEntity<Void> delete(@PathVariable("username") String username) {
		oduserService.delete(username);
		
		return ResponseEntity.ok().build();
	}
	
}
