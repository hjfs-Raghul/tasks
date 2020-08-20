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
	LEFT,
	NIL;
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
	@Column(name = "Matches")
	private int matches;
	@Column(name = "Total_Runs")
	private int total;
	@Column(name = "Average")
	private double avg;
	
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
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
	/*
	 * public Profile(String name , double avg) { this.avg = avg; this.name = name;
	 * }
	 */
}
