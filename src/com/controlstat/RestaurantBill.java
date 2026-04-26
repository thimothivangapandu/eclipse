package com.controlstat;
import java.util.*;
public class RestaurantBill {
	
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter 1st Item Name: ");
	       String item1=sc.nextLine();
	       System.out.println("Enter Quantity: ");
	       int quantity1=sc.nextInt();
	       System.out.println("Enter Price for 1 Quantity: ");
	       int price1=sc.nextInt();
	       int amount1= price1 * quantity1;
	       sc.nextLine();
	       System.out.println("Enter 2nd Item Name: ");
	       String item2=sc.nextLine();
	       System.out.println("Enter Quantity: ");
	       int quantity2=sc.nextInt();
	       System.out.println("Enter Price for 2 Quantity: ");
	       int price2=sc.nextInt();
	       int amount2= price2 * quantity2;
	       sc.nextLine();
	       int totalBill = amount1 + amount2;
	       int discount=0;
	       if (totalBill >= 1000) {
	           discount = (totalBill/100)*20;
	       } else if (totalBill > 500) {
	           discount = (totalBill/100)*10;
	       }else {
	    	   discount = 0;
	       }
	       int payableAmount = totalBill - discount;
	       System.out.println("                                                       ");
	       System.out.println("================= THIMOTHI'S RESTAURANT ================= ");
	       System.out.println("------------------  SeasoneD WitH LovE  -----------------");
	       System.out.println("----------------------------------------------------");
	       System.out.println(  "Item"+"                 "+"Quantity"+"    "+"Price"+"    "+"Amount"   );
	       System.out.println("----------------------------------------------------");
	       System.out.println(   item1+"             "+quantity1+"         "+price1+"      "+amount1);
	       System.out.println(   item2+"         "+quantity2+"         "+price2+"      "+amount2);
	       System.out.println("----------------------------------------------------");
	       System.out.println("Total Bill"+"                                 "+totalBill);
	       System.out.println("Discount "+"                                  "+discount);
	       System.out.println("----------------------------------------------------");
	       System.out.println("Payable Amount"+"                             "+payableAmount);
	       System.out.println("                                                          ");
	       System.out.println("          ---  Thank You  ---         ");
	       System.out.println("         ---  Visit Again!!   ---        ");
	      sc.close();
	   }
	}




