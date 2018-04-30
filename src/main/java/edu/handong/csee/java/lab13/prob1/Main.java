package edu.handong.csee.java.lab13.prob1;

public class Main {

	public static void main(String[] args) {
		Friend a = new Friend(); // create instances
		ClassFriend b = new ClassFriend(); // create instances
		SchoolFriend c = new SchoolFriend(); // create instances
		Instanceof.WhatFriend(a); // call Whatfriend with different instances as parameter
		Instanceof.WhatFriend(b);
		Instanceof.WhatFriend(c);
	}
}
