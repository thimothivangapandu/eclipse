package com.blcandelc;

public class StudentResult {
	String studentName;
	int studentId;
	String courseName;
	double totalMarks;
	
	public StudentResult(String studentName,int studentId,String courseName,double totalMarks ) {
		this.studentName=studentName;
		this.studentId=studentId;
		this.courseName=courseName;
		this.totalMarks=totalMarks;
		System.out.println("Student Record Created Successfully");
	}
	
	public void addMarks(double marks) {
		if(marks <= 0) {
			System.out.println("Invalid marks entered");
		}else {
			totalMarks += marks;
		}
	}
	public void calculateGrade() {
		if (totalMarks == 0) {
            System.out.println("No marks available to calculate grade");
            return;
        }
		String grade;
		if(totalMarks >= 90) {
			grade = "A";
		}else if((totalMarks >= 80)&&(totalMarks <= 89)) {
			grade = "B";
		}else if((totalMarks >= 70)&&(totalMarks <= 79)) {
			grade = "C";
		}else if((totalMarks >= 60)&&(totalMarks <= 69)) {
			grade = "D";
		}else {
			grade = "Fail";
		}
		System.out.println("Total Marks: " + totalMarks + " | Grade: " + grade);
	}
	public void viewTotalMarks() {
        System.out.println("Current Total Marks: " + totalMarks);
    }
	
	
}
