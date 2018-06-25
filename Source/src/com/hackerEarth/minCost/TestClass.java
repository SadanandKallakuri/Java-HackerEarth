package com.hackerEarth.minCost;

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         
         int n = Integer.parseInt(br.readLine().trim());
         long k = Long.parseLong(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[n];
         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

        // long out_ = Solve(k, arr);
         //System.out.println(out_);
         System.out.println("nn "+n+" "+"kk "+k);
        for(int i=0; i<arr.length; i++)
         {
         	System.out.println(i+" "+arr[i]);
         }

         wr.close();
         br.close();
    }
    // static long Solve(long k, int[] arr){
    //     // Write code here
    
    // }
}
