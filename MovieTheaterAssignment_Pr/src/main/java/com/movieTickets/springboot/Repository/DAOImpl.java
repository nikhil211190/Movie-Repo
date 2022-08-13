package com.movieTickets.springboot.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.movieTickets.springboot.model.InventoryUpdateRequest;
import com.movieTickets.springboot.model.TheaterRequestModel;
import com.movieTickets.springboot.model.TheaterResponseModel;

@Repository
public class DAOImpl {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	  public  List<Map<String, Object>>  findShows(TheaterRequestModel request) {
		    String sql = "select t.theater_name as theatreName,m.movie_name as movieName,i.capacity as totalCapacity,m.genre  as genre,m.language as language,t.city as city,t.address as address,t.status as status ,i.availableseats as availableSeats "+
		    		 "from movie_database.theatre t,movie_database.movie m,movie_database.inventorydetail i where i.movie_id=m.movie_id and t.theater_id=i.theater_id and t.city=? and i.movie_id=?  and ?"
		    		 + " between i.start_date and i.end_date";
			
		    
		    Object[] param = new Object[] {request.getCity(),request.getMovieId(),request.getInputDate()};

	      List<Map<String, Object>> responseObjectList=   jdbcTemplate.queryForList(sql, param);
		    
		    return responseObjectList;
		    	
		    
		  }

	  
	  
	  
	  
	  public  List<Map<String, Object>>  findAllRunningShowsinCity(TheaterRequestModel request) {
		    String sql = "select t.theater_name as theatreName,m.movie_name as movieName,i.capacity as totalCapacity,m.genre  as genre,m.language as language,t.city as city,t.address as address,t.status as status,i.availableseats as availableSeats  "+
		    		 "from movie_database.theatre t,movie_database.movie m,movie_database.inventorydetail i where i.movie_id=m.movie_id and t.theater_id=i.theater_id and t.city=? ";
			
		    
		    Object[] param = new Object[] {request.getCity()};

	      List<Map<String, Object>> responseObjectList=   jdbcTemplate.queryForList(sql, param);
		    
		    return responseObjectList;
		    	
	  }
	

	  
	  
	  
	  public  List<Map<String, Object>>  returnEntityAfterUpdate(InventoryUpdateRequest request) {
		    String sql = "select t.theater_name as theatreName,m.movie_name as movieName,i.capacity as totalCapacity,m.genre  as genre,m.language as language,t.city as city,t.address as address,t.status as status,i.availableseats as availableSeats  "+
		    		 "from movie_database.theatre t,movie_database.movie m,movie_database.inventorydetail i where i.movie_id=? and i.theater_id=? and  i.movie_id=m.movie_id and t.theater_id=i.theater_id ";
			
		    
		    Object[] param = new Object[] {request.getMovieId(),request.getTheatreId()};

	      List<Map<String, Object>> responseObjectList=   jdbcTemplate.queryForList(sql, param);
		    
		    return responseObjectList;
		    	
		    
		  }
	  
	 

		     			
		     		
}

