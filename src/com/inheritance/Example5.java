package com.inheritance;

class Student{
	public String name;
	public String studentId;
	
	public Student(String name,String studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	
	public void displayStudentInfo() {
		System.out.println("Name:" +name+ "," + " Student ID: " +studentId);
	}
}


class Undergraduate extends Student{
	public String major;
	
	public Undergraduate(String name,String studentId,String major) {
		super(name,studentId);
		this.major = major;
	}
	public void displayUndergraduateInfo() {
		System.out.println("Major: " +major);
	}
	
}

class Graduate extends Student{
	public String thesisTopic;
	
	public Graduate(String name,String studentId,String thesisTopic) {
		super(name,studentId);
		this.thesisTopic=thesisTopic;
	}
	public void displayGraduateInfo() {
		System.out.println("Thesis Topic: " +thesisTopic);
	}
}


class PhDStudent extends Student{
	public String researchArea;
	
	public PhDStudent(String name,String studentId,String researchArea) {
		super(name,studentId);
		this.researchArea = researchArea;
		
	}
	public void displayPhDStudentInfo() {
		System.out.println("Research Area: " +researchArea);
	}
	
	
}
public class Example5 {

	public static void main(String[] args) {
		Student undergraduate = new Undergraduate("Alice", "U12345", "Computer Science");
		undergraduate.displayStudentInfo();
		((Undergraduate) undergraduate).displayUndergraduateInfo();
		System.out.println("--------------------------------------------");
		Student graduate = new Graduate("Bob", "G67890", "Machine Learning");
		graduate.displayStudentInfo();
		((Graduate) graduate).displayGraduateInfo();
		System.out.println("--------------------------------------------");
		
		Student phdStudent = new PhDStudent("Charlie", "P11223", "Artificial Intelligence");
		phdStudent.displayStudentInfo();
		((PhDStudent) phdStudent).displayPhDStudentInfo();

	}

}
