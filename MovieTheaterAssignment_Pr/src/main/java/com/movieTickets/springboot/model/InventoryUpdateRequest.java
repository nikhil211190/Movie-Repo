package com.movieTickets.springboot.model;

public class InventoryUpdateRequest {

	public Integer getTheatreId() {
		return theatreId;
	}


	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}


	public Integer getMovieId() {
		return movieId;
	}


	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}


	Integer theatreId;
	
	
	Integer movieId;
	
	public Integer getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}


	Integer availableSeats;
	
}
