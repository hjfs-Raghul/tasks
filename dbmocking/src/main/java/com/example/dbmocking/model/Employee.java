package com.example.dbmocking.model;

public class Employee {
	

	String EmpId;
	String name;
	double salalry;
	Address address;
	
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalalry() {
		return salalry;
	}
	public void setSalalry(double salalry) {
		this.salalry = salalry;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}

class Address {
	
	private String doorNo;
	private String street;
	private String city;
	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	private int pinCode;
	
	@Override
	public String toString() {
	
		return this.doorNo + ", " + this.street +",\n" + this.city + " - " + this.pinCode;
				
	}
	
}