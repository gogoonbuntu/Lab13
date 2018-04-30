package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Rectangle extends Shapes{
	private double l, w, a, p;
	public Rectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and width: "); // get input for length and width.
		l=sc.nextDouble();
		w=sc.nextDouble();
		System.out.println("Length: "+l+"\nWidth: "+w); 
		// immediately print out the length and width.
	}
	public double area()
	{
		a=l*w;
		return a; // calculate the area, which is in interface.
	}
	public double perimeter()
	{
		p=2*(l+w);
		return p; // calculate the perimeter, which is in interface.
	}
}
