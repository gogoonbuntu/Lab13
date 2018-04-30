package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	String Publisher;
	public Science(String a, String b)
	{
		super(a);//get name of parent constructor
		Publisher=b;//unique var for Science.
	}
	public void show()
	{
		System.out.println("<<<Science>>>");
		System.out.println("\tID: "+thisid);
		System.out.println("\tBook Name: "+BookName);
		System.out.println("\tPublisher: "+Publisher);
		//result as example shows.
	}
}
