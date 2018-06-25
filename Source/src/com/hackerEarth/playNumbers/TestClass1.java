package com.hackerEarth.playNumbers;


import java.util.*;

class TestClass1 {
    public static int[] a;
    public static int[] sum;
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        // Write your code here
        TestClass t3=new TestClass();
        int numq = s.nextInt();
        a=new int[num];
        int start,end,diff,sum1,res;
        sum1=0;
        sum=new int[num];
        for(int i=0;i<=num-1;i++){
            a[i]=s.nextInt();
            sum1=sum1+a[i];
            sum[i]=sum1;
            //System.out.println(a[i] + "");
            //System.out.println(i+" "+sum[i]);
        }
        for(int i=0;i<=numq-1;i++){
            start=s.nextInt();
            end=s.nextInt();
            diff=end-start+1;
            //res=t3.sum(start,end);
            if(start==1)
            res=sum[end-1];
            else
            res=sum[end-1]-sum[start-2];
            
          System.out.println(res/diff);
        }
    }
    // public int sum(int start,int end){
    //     int res;
    //         if((start-1)==0){
    //         res=sum[end-1];}
    //         else{
    //         res=sum[end-1]-sum[start-2];}
            
    //         return res;
    // }
    
}

