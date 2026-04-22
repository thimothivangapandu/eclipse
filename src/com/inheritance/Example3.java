package com.inheritance;



abstract class Shape{
	
public abstract double calculateArea();
}

class Circle extends Shape{
	public int radius;
	
	
	
	 public Circle(int radius) {
	        this.radius = radius;
	      }
	public double calculateArea() {
		
		return Math.PI*radius*radius;
		
	}
	public double calculateCircleArea() {
        return calculateArea();
    }
	
	
}

class Rectangle extends Shape{
	public int length;
	public int width;
	
	public Rectangle(int length,int width ) {
		 this.length=length;
		 this.width=width;
	}
	
	 public double calculateArea() {
	        return length * width;
	    }

	    public double calculateRectangleArea() {
	        return calculateArea();
	    }
	
}

class Triangle extends Shape{
	public int base;
	public int height;
	
	public Triangle(int base,int height) {
		 
		 this.base=base;
		 this.height=height;

	}
	  public double calculateArea() {
	        return 0.5 * base * height;
	    }

	    public double calculateTriangleArea() {
	        return calculateArea();
	    }
}




public class Example3 {

	public static void main(String[] args) {
		
		Shape circle = new Circle(5);
		System.out.println(circle.calculateArea()); 
		System.out.println(((Circle) circle).calculateCircleArea());
		
		System.out.println("------------------------");
		Shape rectangle = new Rectangle(4, 6);
		System.out.println(rectangle.calculateArea());
		System.out.println(((Rectangle) rectangle).calculateRectangleArea());
		
		System.out.println("------------------------");
		Shape triangle = new Triangle(3, 7);
		System.out.println(triangle.calculateArea());
		System.out.println(((Triangle) triangle).calculateTriangleArea());
		


	}

}
