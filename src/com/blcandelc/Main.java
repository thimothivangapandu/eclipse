package com.blcandelc;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter Student Name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter Student ID: ");
		        int id = sc.nextInt();
		        sc.nextLine();

		        System.out.print("Enter Course Name: ");
		        String course = sc.nextLine();

		        System.out.print("Enter First Subject Marks: ");
		        double firstMarks = sc.nextDouble();

		       
		        StudentResult student = new StudentResult(name, id, course, firstMarks);

		       
		        int option;
		        boolean result = true;
		        while(result) {
		        	 System.out.println("\n--- Menu ---");
		             System.out.println("1. Add more subject marks");
		             System.out.println("2. Calculate grade");
		             System.out.println("3. View total marks");
		             System.out.println("4. Exit");
		             System.out.print("Enter your choice: ");
		             option = sc.nextInt();

		            switch (option) {
		                case 1:
		                    System.out.print("Enter marks to add: ");
		                    double marks = sc.nextDouble();
		                    student.addMarks(marks);
		                    break;
		                case 2:
		                    student.calculateGrade();
		                    break;
		                case 3:
		                    student.viewTotalMarks();
		                    break;
		                case 4:
		                    System.out.println("Thank You! Result Processing Completed.");
		                    result = false;
		                    break;
		                    
		                default:
		                    System.out.println("Invalid option");
		            }
		        } 

		        sc.close();
		    }
		

	}


