package edu.handong.csee.java.lab13.prob2;

public class History extends Book{
	String Author;
	public History(String a, String b)
	{
		super(a);//get name of parent constructor
		Author=b;//unique var for History
	}
	public void show()
	{
		System.out.println("<<<History>>>");
		System.out.println("\tID: "+thisid);
		System.out.println("\tBook Name: "+BookName);
		System.out.println("\tAuthor: "+Author);
	} //output as the example shows.
}
