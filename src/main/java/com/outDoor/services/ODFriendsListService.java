package com.outDoor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.outDoor.repositories.ODFriendslistRepository;

@Service
public class ODFriendsListService {

	@Autowired
	private ODFriendslistRepository ODFriendsListDAO;
	
	public List<String> findAllUsersFriends(String username){
		return ODFriendsListDAO.findAllUsersFriends(username);
	}
	
}
