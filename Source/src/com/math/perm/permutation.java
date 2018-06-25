package com.math.perm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permutation {
//public static List l1= new ArrayList();
public static List<String> l1 = new ArrayList<String>();

public static int y=-1;
public static int z;

	public static void main(String[] args) {
		String str1="22:44";
		String str=str1.replace(":", "");
		System.out.println("fff"+str);
	    permutation("", str); 
	    System.out.println(l1);
	    Object obj = Collections.min(l1);
	    System.out.println("min"+obj);

	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    System.out.println("////"+prefix);
	    if (n == 0) {
	    	
	    	System.out.println(prefix);
	    	if(Character.getNumericValue(prefix.charAt(0))<=2 && Character.getNumericValue(prefix.charAt(1))<=3 && Character.getNumericValue(prefix.charAt(2))<=5) {
		    	y++;
		    	System.out.println("inisdeand y"+y);
		    	l1.add(y,prefix);
	    	};
	    	if(Character.getNumericValue(prefix.charAt(0))<=1 && Character.getNumericValue(prefix.charAt(2))<=5) {
	    	    y++;
	    		l1.add(y,prefix);
	    	}
	    }

	    else {
	        for (int i = 0; i < n; i++) {

	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	            
	        }
	    }
	}
}
