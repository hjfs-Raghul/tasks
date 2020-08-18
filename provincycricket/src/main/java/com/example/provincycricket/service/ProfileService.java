package com.example.provincycricket.service;

import java.util.List;

import com.example.provincycricket.model.Profile;

public interface ProfileService {
	
	void playerRegistration(Profile newPlayer);
	List<Profile> displayPlayers();

	
}
