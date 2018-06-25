package com.hackerEarth.twoStrings;

import java.util.*;
import java.io.*;
import java.net.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        String[] name1=new String[2*num];
        String[] name2=new String[2*num];
        
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        for(int i=0;i<num;i++){
           name1[i] = s.next();
           name2[i] = s.next();
           
           System.out.println(i+" "+name1[i].hashCode());
           System.out.println(i+" "+name2[i].hashCode());
           
           System.out.println(i+" "+ch);
        }
        

    }
}
