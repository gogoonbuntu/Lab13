package edu.handong.csee.java.lab13.prob2;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Simple Book");
		Science b2 = new Science("Hello Physics!","ScienceWorld");
		History b3 = new History("What Is History?","E.H.Carr");
		History b4 = new History("The South Korea","Judis");
		b1.show();
		b2.show();
		b3.show();
		b4.show();
	}

}
