package com.example.provincycricket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.provincycricket.model.Profile;
import com.example.provincycricket.exception.ProfileException;
import com.example.provincycricket.service.ProfileService;

@RestController
@RequestMapping(value = "player")
public class ProfileController {

	@Autowired
	private ProfileService playerService;
	
	@PostMapping(value = "register" )
	public ResponseEntity<String> addPlayer(@RequestBody Profile player){ //throws ProfileException {
		try {
			if(player.getName()=="") 
				return ResponseEntity.badRequest().body("Name should not be Empty \n"+player);
			playerService.playerRegistration(player);
			//System.out.println(player.getBatting().getClass());
			
		} catch(Exception Ex) {
			System.out.println(Ex.toString());
		}
		return ResponseEntity.ok("Player Registered successsfully and ID is "+player.getId().toString());
	}
	
	
	@GetMapping(value = "view")
	public List<Profile> viewUser() {
		return playerService.displayPlayers();
	}
}
