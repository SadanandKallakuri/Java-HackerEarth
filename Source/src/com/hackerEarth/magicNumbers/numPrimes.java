package com.hackerEarth.magicNumbers;

public class numPrimes {

	public static void main(String[] args) {
		int c=0;
		for(int i=65;i<=90;i++){
            int count=0;
            for(int j=1;j<=i;j++){
            if(i%j == 0)
            count++;
            }
            if(count==2) {
            	c++;
            	
            	System.out.print(i + " ");
            }
            
        }
		for(int i=97;i<=122;i++){
            int count=0;
            for(int j=1;j<=i;j++){
            if(i%j == 0)
            count++;
            }
            if(count==2) {
            	c++;
            	
            	System.out.print(i + " ");
            }
            
        }
		System.out.print(c + " count");
	}

}
