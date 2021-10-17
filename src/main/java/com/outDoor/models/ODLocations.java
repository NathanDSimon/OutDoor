package com.outDoor.models;

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
public class ODLocations {

	@Id
	@Column(table = "Locations", nullable = false, unique = true, updatable= false)
	private Long primaryLocation;
	
	@Column(table = "Locations", name = "latitude", nullable = false)
	private Double latitude;
	
	@Column(table = "Locations", name = "longitude", nullable = false)
	private Double longitude;

}
