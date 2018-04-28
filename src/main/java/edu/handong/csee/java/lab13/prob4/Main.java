package edu.handong.csee.java.lab13.prob4;

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Master m1 = new Master();
		String a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the cat name and dog name: ");
		a=sc.next();
		b=sc.next();
		Cat c1 = new Cat(a);
		Dog d1 = new Dog(b);
		c1.getName();
		m1.feed((Pet) c1);
		d1.getName();
		m1.feed((Pet) d1);
	}
}
