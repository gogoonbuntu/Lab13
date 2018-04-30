package edu.handong.csee.java.lab13.prob6;

public class UP implements CapitalPrint {
	private int x;
	private int y; //private values to limit access
	public UP(int x, int y) {this.x=x;this.y=y;} //create constructors
	public String toString()
	{
		return "X = "+x+", Y = "+y; //return the string message
	}
}
