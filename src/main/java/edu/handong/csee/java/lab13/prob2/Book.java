package edu.handong.csee.java.lab13.prob2;

public class Book {
	static int Id=0;
	int thisid;
	String BookName;
	public Book(String a)
	{
		Id++;
		this.thisid=Id;
		BookName=a;
	}
	public void show()
	{
		System.out.println("<<<BOOK>>>");
		System.out.println("\tID: "+thisid);
		System.out.println("\tBook Name: "+BookName);
	}
}
