package com.inheritance;

class Vehicle{
	public String make;
	public String model;
	public int year;
		
public Vehicle(String make,String model,int year) {
	this.make=make;
	this.model=model;
	this.year=year;
}
public void displayInfo() {
	System.out.println(make +" "+ model +" "+ year);
}
}

class Car extends Vehicle{
	public int numberOfDoors;
	
	
	 public Car(String make, String model, int year, int numberOfDoors) {
	        super(make, model, year); 
	        this.numberOfDoors = numberOfDoors;
	    }
	 
	public void displayCarInfo() {
		
		System.out.println("Number of doors: " +numberOfDoors);
		
	}
	
}

class Truck extends Vehicle{
	public int cargoCapacity;
	
	public Truck(String make, String model, int year, int cargoCapacity) {
	   super(make,model,year);
	   this.cargoCapacity=cargoCapacity;
	}
	
	public void displayTruckInfo() {
		System.out.println("Cargo Capacity:" +cargoCapacity);
	}
}

class Motorcycle extends Vehicle{
	public boolean hasSideCar;
	
	public Motorcycle(String make, String model, int year, boolean hasSideCar) {
	   super(make,model,year);
	   this.hasSideCar=hasSideCar;
	}
	
	public void displayMotorcycleInfo() {
		System.out.println("Has Sidecar:" +hasSideCar);
	}
}




public class Example1 {

	public static void main(String[] args) {
		Vehicle car= new Car("Toyota", "Corolla", 2022, 4);
		car.displayInfo();
		((Car) car).displayCarInfo();//direct downcasting and calling the car method
		
//		Vehicle vh = new Car("Toyata","Corolla",2022,4);
//		vh.displayInfo();
//		Car c = (Car)vh; downcasting
//		c.displayCarInfo();
		
		System.out.println("------------------------");
		Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
		truck.displayInfo();
		((Truck) truck).displayTruckInfo();
		System.out.println("------------------------");

		Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
		motorcycle.displayInfo(); 
		((Motorcycle) motorcycle).displayMotorcycleInfo();

	}

}
