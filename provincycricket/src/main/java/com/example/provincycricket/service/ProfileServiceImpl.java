package com.example.provincycricket.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.provincycricket.model.Profile;
import com.example.provincycricket.repo.ProfileRepo;

@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	private ProfileRepo playerRepo;

	@Override
	@Transactional
	public void playerRegistration(Profile newPlayer) {
			playerRepo.save(newPlayer);		
	}

	@Override
	@Transactional
	public List<Profile> displayPlayers() {
		return playerRepo.findAll();
	}


	
}
	
