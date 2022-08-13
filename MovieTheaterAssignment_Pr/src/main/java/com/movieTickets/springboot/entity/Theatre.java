package com.movieTickets.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "theatre")
public class Theatre {

	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer theaterId;
	
	public Integer getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	@Column
	String theaterName;
	
	@Column
	String city;
	
	@Column
	String address;
	
	
	
	@Column
	 String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
