package com.test;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Owner Name: ");
        String ownerName = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Service Center Name: ");
        String serviceCenter = sc.nextLine();

        System.out.print("Enter Service Category: ");
        String serviceCategory = sc.nextLine();
        
        

          
            Vehicle v = new ServiceVehicle(ownerName,vehicleNumber,vehicleType,serviceCenter,serviceCategory);
            
            
            System.out.println("Vehicle Profile Created Successfully");
            
            

            ServiceVehicle sv = (ServiceVehicle)v;

            
            boolean result = true;
           
            
            	 while(result) {

                System.out.println("------ Vehicle Service Menu ------");
                System.out.println("1. Update Service Category");
                System.out.println("2. Update Service Center");
                System.out.println("3. View Vehicle Profile");
                System.out.println("4. Exit");
            	 
                System.out.print("Choose an option: ");
                int option = sc.nextInt();
                sc.nextLine();
                
                switch (option) {
                case 1:

                    System.out.print("Enter New Service Category: ");
                    String newCategory = sc.nextLine();
                    sv.updateServiceCategory(newCategory);
                    break;

                case 2:

                    System.out.print("Enter New Service Center: ");
                    String newCenter = sc.nextLine();

                    sv.updateServiceCenter(newCenter);
                    break;

                case 3:

                    v.displayProfile();
                    break;

                case 4:

                    System.out.println("Exit..");
                    result = false;
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

            	 }        
            	 sc.close();
    }
}
          
        