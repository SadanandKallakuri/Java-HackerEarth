package com.hackerEarth.seatingArr;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ){
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + num + ".");    // Writing output to STDOUT

        

        // Write your code here
        for(int i=1;i<=num;i++){
            int seat=s.nextInt();
                int seatOpp=seat%12;
                int num1;
	
	switch(seatOpp) {
	case 0:num1=seat-11;
    System.out.println(num1+" WS");break;
	case 1:num1=seat+11;
    System.out.println(num1+" WS");break;
	case 2:num1=seat+9;
    System.out.println(num1+" MS");break;
	case 3:num1=seat+7;
    System.out.println(num1+" AS");break;
	case 4:num1=seat+5;
    System.out.println(num1+" AS");break;
	case 5:num1=seat+3;
    System.out.println(num1+" MS");break;
	case 6:num1=seat+1;
    System.out.println(num1+" WS");break;
	case 11:num1=seat-9;
	System.out.println(num1+" MS");break;
	case 10:num1=seat-7;
	System.out.println(num1+" AS");break;
	case 9:num1=seat-5;
	System.out.println(num1+" AS");break;
	case 8:num1=seat-3;
	System.out.println(num1+" MS");break;
	case 7:num1=seat-1;
	System.out.println(num1+" WS");break;
	}
             
        }
    }
}
