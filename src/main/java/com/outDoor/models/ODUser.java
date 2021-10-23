package com.outDoor.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
public class ODUser {
	
	@Id
	@Column(name = "Username", length = 24, nullable = false)
	private String username;
	
	@Column(name = "email", length = 24, nullable = false)
	private String email;
	
	@Column(name = "address", length = 50, nullable = false, updatable= false)
	private String address;
	
	@Column(name = "DoB", nullable = false, updatable= false)
	private Date DoB;
	
	@Column(name = "primary_location", nullable = false)
	private Long primaryLocation;

	@Column(name = "password", nullable = false)
	private String password;
//	@Column(table = "User", name = "friend_list_ID", nullable = false)
//	private Long friendListId;
	
}
