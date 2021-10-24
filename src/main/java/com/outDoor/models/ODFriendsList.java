package com.outDoor.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_Link")
@IdClass(ODFriendsListPK.class)
public class ODFriendsList {
	
	@Id
	@Column(length = 12, nullable = false)
	private String Username;
	
	@Id
	@Column(name = "Linked_Username", nullable = false)
	private String LinkedUsername;
	

}
