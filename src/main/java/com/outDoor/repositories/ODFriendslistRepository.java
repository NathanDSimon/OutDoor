package com.outDoor.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.outDoor.models.ODFriendsList;

public interface ODFriendslistRepository extends JpaRepository<ODFriendsList, String> {
	
	@Query("Select f.LinkedUsername FROM ODFriendsList f WHERE f.Username = :Username")
	List<String> findAllUsersFriends(
			@Param("Username") String username);
			
//			@Param("Username") String username,
//			JpaSort Sort);
	
}