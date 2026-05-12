package com.test;


abstract class Vehicle {
	
     private String ownerName;
     private String vehicleNumber;
     private String vehicleType;
     
     //getters
	 public String getOwnerName() {
		return ownerName;
	}
	 public String getVehicleNumber() {
		 return vehicleNumber;
	 }
	 public String getVehicleType() {
		 return vehicleType;
	 }
	 
	 //setters
	 public void setOwnerName(String ownerName) {
		 this.ownerName = ownerName;
	 }
	 public void setVehicleNumber(String vehicleNumber) {
		 this.vehicleNumber = vehicleNumber;
	 }
	 public void setVehicleType(String vehicleType) {
		 this.vehicleType = vehicleType;
	 }
	 
	 Vehicle(String ownerName, String vehicleNumber,String vehicleType){
		this.ownerName = ownerName;
		this.vehicleNumber=vehicleNumber;
		this.vehicleType = vehicleType;
	 }
	 public abstract void displayProfile();
	
     
		 
		

	}


