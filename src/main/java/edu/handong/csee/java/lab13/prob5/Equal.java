package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Equal {
	public static void main(String[] args)
	{
		int r1, c1, r2, c2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size(maximum 5): ");
		r1=sc.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		c1=sc.nextInt();
		System.out.print("Enter row size(maximum 5): ");
		r2=sc.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		c2=sc.nextInt();
		System.out.print("Enter List1: ");
		int[][] ar1 = makeArray(r1, c1);
		System.out.print("Enter List2: ");
		int[][] ar2 = makeArray(r2, c2);
		printArray(ar1);
		printArray(ar2);
		equal(ar1, ar2);
	}
	public static int[][] makeArray(int r1, int c1)
	{
		int[][] ar1 = new int[r1][c1];
		Scanner sc1 = new Scanner(System.in);
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				ar1[i][j]=sc1.nextInt();
			}
			System.out.print("\n");
		}
		return ar1;
	}
	public static void printArray(int[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public static void equal(int[][] ar1, int[][] ar2)
	{
		int ercount=0;
		boolean k=true;
		if(ar1.length!=ar2.length)
		{
			k=false;
		}
		else
		{
			for(int i=0;i<ar1.length;i++)
			{
				for(int j=0;j<ar1[i].length;j++)
				{
					if(ar1[i][j]!=ar2[i][j])
					{
						ercount++;
					}
				}
			}
			if(ercount>3) {k=false;}
		}
		if(k) {System.out.println("The two arrays are approximately identical.");}
		else {System.out.println("The two arrays are NOT identical.");}
	}
}
