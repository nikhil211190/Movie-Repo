package com.movieTickets.springboot.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.movieTickets.springboot.entity.InventoryDetail;
import com.movieTickets.springboot.entity.Theatre;
import com.movieTickets.springboot.model.TheaterResponseModel;


public interface TheatreRepository  extends JpaRepository<InventoryDetail, Long>{


	    
	    
	    
	    @Query(value="select * from movie_database.inventorydetail i where i.movie_id=:movieId and i.theater_id=:theatreId",nativeQuery = true)
	    InventoryDetail getIndividualInventoryRecords(@Param("movieId") Integer movieId,@Param("theatreId") Integer theatreId);
	
	  
}
