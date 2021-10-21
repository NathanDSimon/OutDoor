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
	@Column(table = "User_Link", length = 12, nullable = false)
	private String userName;
	
	@Column(table = "User_Link", name = "Linked_User_Name", nullable = false)
	private JSONObject friendslist;
	

}
