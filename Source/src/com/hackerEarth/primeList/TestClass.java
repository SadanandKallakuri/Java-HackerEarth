package com.hackerEarth.primeList;



import java.util.*;

class TestClass {
    public static void main(String args[] ){
         //Sample code to perform I/O:
          //Use either of these methods for input

        // //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        int name = s.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        

        // Write your code here
        
        //System.out.println(name);
        
        for(int i=1;i<=name;i++){
            int count=0;
            for(int j=1;j<=i;j++){
            if(i%j == 0)
            count++;
            }
            if(count==2)
            System.out.print(i + " ");
        }
    }
}