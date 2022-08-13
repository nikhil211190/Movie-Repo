package com.movieTickets.springboot.model;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


public class TheaterRequestModel {

Integer movieId;


public Integer getMovieId() {
	return movieId;
}

public void setMovieId(Integer movieId) {
	this.movieId = movieId;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}



String city;


@DateTimeFormat(pattern="yyyy-MM-dd") 
LocalDate inputDate;


public LocalDate getInputDate() {
	return inputDate;
}

public void setInputDate(LocalDate inputDate) {
	this.inputDate = inputDate;
}
	
	
}
