package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	String Publisher;
	public Science(String a, String b)
	{
		super(a);
		Publisher=b;
	}
	public void show()
	{
		System.out.println("<<<Science>>>");
		System.out.println("\tID: "+thisid);
		System.out.println("\tBook Name: "+BookName);
		System.out.println("\tPublisher: "+Publisher);
	}
}
