package edu.handong.csee.java.lab13.prob1;



public class Instanceof {

	public static void WhatFriend(Friend a)
	{
		/*if statement to filter what friend it is from lowest class(classfriend) to upper ones. */
		if(a instanceof ClassFriend) {((ClassFriend) a).classFriend();}
		else if(a instanceof SchoolFriend) {((SchoolFriend) a).schoolFriend();}
		else a.friend();
	}
}
