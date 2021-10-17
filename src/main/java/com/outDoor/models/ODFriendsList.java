package com.outDoor.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.json.JSONObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ODFriendsList {
	
	@Id
	@Column(table = "User_Friendlist", length = 12, nullable = false, unique = true, updatable= false)
	private String userName;
	
	@Column(table = "User_Friendlist", name = "friendslist", nullable = false)
	private JSONObject friendslist;
	

}
