package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{
	public Dog(String a)
	{
		super(a);// get name from parent constructor
	}
	public void food()
	{
		System.out.println("(Dog!) Sausage"); // call dog.food, print out what dog eat(sausage). 
	}
}
