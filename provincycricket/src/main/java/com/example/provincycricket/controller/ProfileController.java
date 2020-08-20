package com.example.provincycricket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.*;

import com.example.provincycricket.model.Profile;
import com.example.provincycricket.service.ProfileService;

@RestController
@RequestMapping(value = "profile")

@CrossOrigin(origins = {"http://10.0.2.2:8000", "http://localhost:41205/#/"})
public class ProfileController {

	@Autowired
	private ProfileService playerService;
	
	@PostMapping(value = "register" )
	public Map<String, Object> addPlayer(@RequestBody Profile player){ //throws ProfileException {
		Map<String, Object> response =  new HashMap<String, Object>();
		try {
			if(player.getName()=="") 
				response.put("msg", "Invalid Name or Empty Name");
			if(player.getBatting() == null ||
					player.getBowling() == null)
				response.put("msg","Invalid properties of the player");
			player.setAvg(player.getTotal()/player.getMatches());
			playerService.playerRegistration(player);
			response.put("msg","Player Registered successsfully");	
			response.put("body",player);
		} catch(Exception Ex) {
			response.put("Error",Ex.toString());
		}
		
		
		return response;
	}
	
	@GetMapping(value = "test")
	public String testFunction() {
		return "Test String";
	}
	
	@GetMapping(value = "view")
	public Map<String, Object> viewUser() {
		Map<String, Object> response = new HashMap<>();
		List<Profile> playersList =  playerService.displayPlayers();
		//response.put
		for(Profile item : playersList) 
			response.put(item.getId().toString(),item);
		return response;
	}
	
	@GetMapping(value = "leaderboard")
	public Map<String,Object> LeaderBoard() {
		Map<String,Object> response = new HashMap<>();
		response.put("msg", playerService.LeaderBoard());
		return response;

	}
	
}

