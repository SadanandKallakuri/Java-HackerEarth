package com.learn.earliestTime;


import java.util.ArrayList;
import java.util.Collections;

public class earliestTime {
	
	
	public static void main(String[] args) {
		 ArrayList<String>  mylist = new ArrayList<String>();
	        mylist.add("code");
	        mylist.add("quiz");
	        mylist.add("geeksforgeeks");
	        mylist.add("quiz");
	        mylist.add("practice");
	        mylist.add("qa");
	 
	        System.out.println("Original List : \n" + mylist);
	 
	        Collections.shuffle(mylist);
	 
	        System.out.println("\nShuffled List : \n" + mylist);
	}

}
