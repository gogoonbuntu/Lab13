package edu.handong.csee.java.lab13.prob3;

public abstract class Shapes {
	public abstract double area();
	public abstract double perimeter(); // abtract classes, will be clearly defined in lower class.
	public void show()
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter()+"\n");
		//print out the area and perimeter of the object.
	}
}
