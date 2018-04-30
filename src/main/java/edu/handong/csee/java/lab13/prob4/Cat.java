package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{
	public Cat(String a)
	{
		super(a); // get name from parent constructor
	}
	public void food()
	{
		System.out.println("(Cat!) Fish"); // call cat.food, prints out what cat eat(fish).
	}
}
