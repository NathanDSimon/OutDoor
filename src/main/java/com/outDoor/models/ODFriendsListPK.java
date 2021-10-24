package com.outDoor.models;

import java.io.Serializable;
import java.util.Objects;

public class ODFriendsListPK implements Serializable {
	
	private String Username;
	
	private String LinkedUsername;

	public ODFriendsListPK(String username, String linkedUsername) {
		super();
		Username = username;
		LinkedUsername = linkedUsername;
	}

	@Override
	public int hashCode() {
		return Objects.hash(LinkedUsername, Username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ODFriendsListPK other = (ODFriendsListPK) obj;
		return Objects.equals(LinkedUsername, other.LinkedUsername) && Objects.equals(Username, other.Username);
	}
	
	

}
