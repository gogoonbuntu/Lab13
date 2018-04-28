package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{
	public Cat(String a)
	{
		super(a);
	}
	public void food()
	{
		System.out.println("(Cat!) Fish");
	}
}
