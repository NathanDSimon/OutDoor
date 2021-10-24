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
import com.outDoor.services.ODFriendsListService;
import com.outDoor.services.ODUserService;

@RestController
@RequestMapping("/friends")
public class ODFriendsListController {

		@Autowired
		private ODFriendsListService odfriendService;
		
		@Autowired
		private ODUserService oduserService;
		
		@GetMapping("/{username}")
		public ResponseEntity<List<String>> findAllUsersFriends(@PathVariable("username") String username) {
			return ResponseEntity.ok(odfriendService.findAllUsersFriends(username));
		}
		
		@PostMapping("/{username}/{new}")
		public ResponseEntity<Optional<ODUser>> create(@PathVariable("username") String username,@PathVariable("new") String friend) {
			Optional<ODUser> user = oduserService.findByUsername(username);
			Optional<ODUser> newfriend = oduserService.findByUsername(friend);

			if(user.isPresent() & newfriend.isPresent()) {
	
				return ResponseEntity.accepted().body(newfriend);
			}
			
			return ResponseEntity.unprocessableEntity().build();
	}
	
}
