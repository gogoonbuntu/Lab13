package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Circle extends Shapes{
	private double r, a, p;
	public Circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: "); // get input for radius.
		r = sc.nextDouble(); // r = input.
		System.out.println("Radius: "+r); //immediately print out the radius.
	}
	public double area()
	{
		a = r*r*Math.PI;
		return a; // calculate the area, which is in interface.
	}
	public double perimeter()
	{
		p = 2*r*Math.PI;
		return p; // calculate the perimeter, which is in interface.
	}
}
