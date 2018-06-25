package com.hackerEarth.anagrams;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


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
    	//System.out.println("Enter num");
        //Scanner
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(); 
        //System.out.println("Hi, " + num + ".");
        String str = s.nextLine();                 // Reading input from STDIN
        
        //System.out.println("Hi, " + str2 + ".");    // Writing output to STDOUT

        

        // Write your code here
        for(int i=1;i<=num;i++){
             String str1 = s.nextLine(); 
        String str2 = s.nextLine();
        int strlen1=str1.length();
        int strlen2=str2.length();
        int count=strlen1+strlen2;
       // System.out.println("Hi, " + strlen1 + ".");
        //System.out.println("Hi, " + strlen2 + ".");
        for(int j=0;j<=strlen1-1;j++){
            for(int k=0;k<=strlen2-1;k++){
                char c1=str1.charAt(j);
                char c2=str2.charAt(k);
                if(c1==c2){
                count=count-2;
                //System.out.println(j+" "+count);
                String sss=str2.substring(0,k)+str2.substring(k+1);
                str2=sss;
                strlen2=sss.length();
                //System.out.println(" String"+sss);
                break;
                }
                  //System.out.println("1"+c1);
                  //System.out.println("2"+c2);
                
            }
        }
        System.out.println(count);
        }

    }
}

