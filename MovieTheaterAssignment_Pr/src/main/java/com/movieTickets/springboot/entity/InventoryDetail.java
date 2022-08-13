package com.movieTickets.springboot.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "inventorydetail")
public class InventoryDetail {


	public Integer getInventoryDetailId() {
		return inventoryDetailId;
	}
	public void setInventoryDetailId(Integer inventoryDetailId) {
		this.inventoryDetailId = inventoryDetailId;
	}
	public Integer getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public String getShowType() {
		return showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="inventory_detail_id")
	Integer inventoryDetailId;

	@Column(name="theater_id")
	Integer theaterId;
	@Column(name="movie_id")
	Integer movieId;
	@Column(name="capacity")
	Integer capacity;
    
	@Column(name="start_date")
	LocalDate startDate;
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	@Column(name="end_date")

    LocalDate endDate;
	@Column(name="show_type")

	String showType;
	
	
	@Column(name="availableseats")

	Integer availableseats;

	public Integer getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(Integer availableseats) {
		this.availableseats = availableseats;
	}
	
	
}
