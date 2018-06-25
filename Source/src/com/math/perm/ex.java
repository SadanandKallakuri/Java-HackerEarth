package com.math.perm;

public class ex {

	public static void main(String[] args) {
		String str1="23:59";
		String str=str1.replace(":", "");
		if(Character.getNumericValue(str.charAt(0))<=2)
			System.out.println("yo");
	}

}
