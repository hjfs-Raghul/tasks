package com.example.provincycricket.repo;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.example.provincycricket.model.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile,Long>{
	
	List<Profile> findByAvgLessThan(Double avg);
	List<Profile> OrderByAvgDesc();
	//List<Profile> Ranking();
	
	@Query(value = "select player_name as Name,average,rank() over(order by average desc)rank_no from profile", nativeQuery = true)
	public List<Object> LeaderBoard();
	
	/*
	 * @Query("select new com.exampl.provincycricket.model.Profile(name, avg) from profile p"
	 * ) List<Profile> showFewColumns();
	 */

}