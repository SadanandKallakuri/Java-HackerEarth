package com.hackerEarth.magicNumbers;

import java.util.*;
import java.lang.*;
class try1 {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int[] dnum=new int[12];
        int num=s.nextInt();
        int c=0;
        int k=-1;
		for(int i=65;i<=90;i++){
            int count=0;
            for(int j=1;j<=i;j++){
            if(i%j == 0)
            count++;
            }
            if(count==2){
            c++;
            
            k++;
            dnum[k]=i;
            }
        }
		for(int i=97;i<=122;i++){
            int count=0;
            for(int j=1;j<=i;j++){
            if(i%j == 0)
            count++;
            }
            if(count==2){
            c++;
            k++;
            dnum[k]=i;
            }
        }
        // for(int y=0;y<=k;y++){
        //     System.out.print(dnum[y] + " "+y);
        // }
		//System.out.print(c + " count");
        for(int i=0;i<num;i++){
        int len=s.nextInt();
        String name = s.next(); 
        char[] arr=name.toCharArray();
        int[] asci=new int[len];
        for(int j=0;j<len;j++){
            asci[j]= arr[j];
            //System.out.println(j+" "+asci[j]);
            int sum1=asci[j];
            for(int u=-2;u<=2;u++){
                sum1=sum1+u;
                
            }
            
        }
        }
        

    }
}
