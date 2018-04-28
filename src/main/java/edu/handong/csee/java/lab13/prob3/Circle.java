package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Circle extends Shapes{
	private double r, a, p;
	public Circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		r = sc.nextDouble();
		System.out.println("Radius: "+r);
	}
	public double area()
	{
		a = r*r*Math.PI;
		return a;
	}
	public double perimeter()
	{
		p = 2*r*Math.PI;
		return p;
	}
}
