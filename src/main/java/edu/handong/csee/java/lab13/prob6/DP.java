package edu.handong.csee.java.lab13.prob6;

public class DP implements CapitalPrint{
	private int x;
	private int y; //private values to limit access
	public DP(int x, int y) {this.x=x;this.y=y;} //create constructors
	public String toString()
	{
		return "x = "+x+", y = "+y; //return the string message
	}
}
