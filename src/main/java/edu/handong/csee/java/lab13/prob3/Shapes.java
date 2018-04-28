package edu.handong.csee.java.lab13.prob3;

public abstract class Shapes {
	public abstract double area();
	public abstract double perimeter();
	public void show()
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter()+"\n");
	}
}
