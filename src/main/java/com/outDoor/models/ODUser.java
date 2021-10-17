package com.outDoor.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ODUser {
	
	@Id
	@Column(table = "User", length = 12, nullable = false, unique = true, updatable= false)
	private String userName;
	
	@Column(table = "User", name = "email", length = 24, nullable = false)
	private String email;
	
	@Column(table = "User", name = "address", length = 50, nullable = false, updatable= false)
	private String address;
	
	@Column(table = "User", name = "DoB", nullable = false, updatable= false)
	private Date DoB;
	
	@Column(table = "User", name = "primary_location", nullable = false)
	private Long primaryLocation;

	@Column(table = "User", name = "friend_list_ID", nullable = false)
	private Long friendListId;
	
}
