package edu.handong.csee.java.lab13.prob4;

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Master m1 = new Master(); // create a master.
		String a, b; // will be used for names of cat and dogs
		Scanner sc = new Scanner(System.in); // a new scanner.
		System.out.print("Enter the cat name and dog name: ");
		a=sc.next(); //a gets name for cat
		b=sc.next(); //b gets name for dog
		Cat c1 = new Cat(a);//instantiate cat, c1.
		Dog d1 = new Dog(b);//instantiate dog, d1.
		c1.getName(); // print out name of cat.
		m1.feed((Pet) c1); //print out what it eats.
		d1.getName(); // print out name of cat.
		m1.feed((Pet) d1); //print out what it eats.
	}
}
