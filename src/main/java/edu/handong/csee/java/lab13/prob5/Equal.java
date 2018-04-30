package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Equal {
	public static void main(String[] args)
	{
		int r1, c1, r2, c2; //create two row sizes, two column sizes.
		Scanner sc = new Scanner(System.in); //a new scanner
		System.out.print("Enter row size(maximum 5): "); //get input from keyboards for 4 integers
		r1=sc.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		c1=sc.nextInt();
		System.out.print("Enter row size(maximum 5): ");
		r2=sc.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		c2=sc.nextInt();
		System.out.print("Enter List1: "); //get input for array.
		int[][] ar1 = makeArray(r1, c1); //reference makeArray functions
		System.out.print("Enter List2: "); //get input for array.
		int[][] ar2 = makeArray(r2, c2);//reference makeArray functions
		printArray(ar1);//reference printArray functions
		printArray(ar2);
		equal(ar1, ar2);//equal function to compare two arrays.
	}
	public static int[][] makeArray(int r1, int c1)
	{
		int[][] ar1 = new int[r1][c1]; // create a array in local memory
		Scanner sc1 = new Scanner(System.in); // a new scanner
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				ar1[i][j]=sc1.nextInt(); //get inputs from keyboard for each element
			}
		}
		return ar1; //return the array made.
	}
	public static void printArray(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" "); //print arrays and put a space between elements.
			}
			System.out.print("\n"); //change line for view.
		}
		System.out.print("\n");
	}
	public static void equal(int[][] ar1, int[][] ar2)
	{
		int ercount=0; // stands for error count
		boolean k=true; // boolean for final decision. true for equal, false for NOT equal.
		if(ar1.length!=ar2.length)
		{
			k=false; // if length(row) is not equal, make the result UNequal.
		}
		else
		{
			for(int i=0;i<ar1.length;i++)
			{
				for(int j=0;j<ar1[i].length;j++)
				{
					if(ar1[i][j]!=ar2[i][j])
					{
						ercount++; // if any element is not equal, error count increase.
					}
				}
			}
			if(ercount>3) {k=false;} // if error count bigger than 3, make the result UNequal.
		}
		if(k) {System.out.println("The two arrays are approximately identical.");}
		else {System.out.println("The two arrays are NOT identical.");}
	}
}
