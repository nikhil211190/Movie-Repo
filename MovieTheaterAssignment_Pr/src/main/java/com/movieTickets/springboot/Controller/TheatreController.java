package com.movieTickets.springboot.Controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieTickets.springboot.Repository.DAOImpl;
import com.movieTickets.springboot.Repository.TheatreRepository;
import com.movieTickets.springboot.entity.InventoryDetail;
import com.movieTickets.springboot.model.InventoryUpdateRequest;
import com.movieTickets.springboot.model.TheaterRequestModel;
import com.movieTickets.springboot.model.TheaterResponseModel;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping("/api/theatre/")
public class TheatreController {

	@Autowired
	TheatreRepository trepo;
	
	
	@Autowired
	DAOImpl daoimpl;
	
	
	@PostMapping(value = "getTheatreDetails", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllTheatreDetails(final @RequestBody TheaterRequestModel request) throws RuntimeException{

		
		Object response=daoimpl.findShows(request);
		
		if(response==null )
		{
	        return new ResponseEntity<>("", HttpStatus.NO_CONTENT);

		}
        return new ResponseEntity<>(response, HttpStatus.OK);
    }	
	
	
	@PostMapping(value = "getShowsForCity", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllTheatreDetailsForCity(final @RequestBody TheaterRequestModel request) throws RuntimeException{

		
		Object response=daoimpl.findAllRunningShowsinCity(request);
		
		if(response==null )
		{
	        return new ResponseEntity<>("", HttpStatus.NO_CONTENT);

		}
        return new ResponseEntity<>(response, HttpStatus.OK);
    }	
	
	
	@PostMapping(value = "updateInventoryForShow", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllTheatreDetailsForCity(final @RequestBody InventoryUpdateRequest request) throws RuntimeException{

		
		InventoryDetail entity=trepo.getIndividualInventoryRecords(request.getMovieId(), request.getTheatreId());
		entity.setAvailableseats(request.getAvailableSeats());
		trepo.save(entity);
		
		Object response=daoimpl.returnEntityAfterUpdate(request);

		
		 return new ResponseEntity<>(response, HttpStatus.OK);		
		
		
    }	
	
	
}
