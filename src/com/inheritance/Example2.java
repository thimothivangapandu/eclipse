package com.inheritance;



class Employee{
	public String name;
	public double baseSalary;
	
		
public Employee(String name,double baseSalary) {
	this.name=name;
	this.baseSalary=baseSalary;
	
}
public double calculateAnnualSalary()  {
	return baseSalary*12;
}
}

class Manager extends Employee{
	public double bonus;
	public int numberOfEmployeesManaged;
	
	
	 public Manager(String name,double baseSalary, double bonus,int numberOfEmployeesManaged) {
	        super(name, baseSalary); 
	        this.bonus = bonus;
	        this.numberOfEmployeesManaged =numberOfEmployeesManaged;
	    }
	public double calculateManagerSalary() {
		
		return calculateAnnualSalary()+bonus;
		
	}
	
}

class Engineer extends Employee{
	public int projectCount;
	
	public Engineer(String name,double baseSalary,int projectCount ) {
		 super(name, baseSalary); 
		 this.projectCount = projectCount;
	}
	
	public double calculateEngineerSalary() {
		return calculateAnnualSalary()+ projectCount*10000;
	}
}

class Salesperson extends Employee{
	public double commissionRate;
	public int totalSales;
	
	public Salesperson(String name,double baseSalary,double commissionRate,int totalSales ) {
		 super(name, baseSalary);
		 this.commissionRate =commissionRate;
		 this.totalSales=totalSales;

	}
	
	public double calculateSalespersonSalary() {
		return calculateAnnualSalary()+totalSales*commissionRate;
	}
}




public class Example2 {

	public static void main(String[] args) {
		
		Employee manager = new Manager("Alice", 50000, 10000, 5);
		System.out.println(manager.calculateAnnualSalary());
		
		System.out.println(((Manager) manager).calculateManagerSalary()); 
		
		System.out.println("------------------------");
		
		Employee engineer = new Engineer("Bob", 70000, 5);
		System.out.println(engineer.calculateAnnualSalary()); 
		System.out.println(((Engineer) engineer).calculateEngineerSalary());
		
		System.out.println("------------------------");
		
		Employee salesperson = new Salesperson("Charlie", 40000, 0.1, 200000);
		System.out.println(salesperson.calculateAnnualSalary()); 
		System.out.println(((Salesperson) salesperson).calculateSalespersonSalary()); 


	}

}
