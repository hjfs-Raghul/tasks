package com.example.provincycricket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

enum BatType{
	RIGHT,
	LEFT;
}

enum BowlType{
	RIGHT,
	LEFT;
}

@Entity
@Table(name = "Profile")
public class Profile {

	@Id
	@Column(name = "Player_Id",nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	@Column(name = "Player_name")
	private String name;
	@Column(name = "Bat_Type")
	private BatType batting;
	@Column(name = "Bowl_Type")	
	private BowlType bowling;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BatType getBatting() {
		return batting;
	}
	public void setBatting(BatType batting) {
		this.batting = batting;
	}
	
	public BowlType getBowling() {
		return bowling;
	}
	public void setBowling(BowlType bowling) {
		this.bowling = bowling;
	}
	
	@Override
	public String toString() {
		return "Name :\t"+ this.name +" \nBatting :\t" + this.batting + " \nBowling :\t" + this.bowling; 
	}
	private Profile() {
		//Cannot create new Player with empty profile values
	}
}
