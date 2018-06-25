package com.hackerEarth.palindrome;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;
import java.lang.*;
import java.io.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 */
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        
       

        // Write your code here
        int strlen=name.length();
        //reversal method 1
        // StringBuilder name1 = new StringBuilder();
        // name1.append(name);
        //  name1=name1.reverse();
        // System.out.println("Hi, " + name1);
        
        //reversal method 2
        String name1=new StringBuffer(name).reverse().toString();
        //System.out.println("Hi, " + name1);
        
        int i=0;
        int j=0;
        for(int k=0;k<strlen;k++){
                if(name.charAt(i)!=name1.charAt(j)){
                    System.out.println("NO");
                    System.exit(0);
                }    
                else{
                    i++;
                    j++;
                }
        }
        System.out.println("YES");
        

    }
}
