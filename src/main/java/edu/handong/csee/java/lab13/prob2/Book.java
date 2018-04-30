package edu.handong.csee.java.lab13.prob2;

public class Book {
	static int Id=0; // this var automatically increase.
	int thisid; // this var for each book-id.
	String BookName;
	public Book(String a)
	{
		Id++; // var automatically increase.
		this.thisid=Id; // get the ID.
		BookName=a;
	}
	public void show()
	{
		System.out.println("<<<BOOK>>>");
		System.out.println("\tID: "+thisid);
		System.out.println("\tBook Name: "+BookName);
	} //output as the example shows.
}
