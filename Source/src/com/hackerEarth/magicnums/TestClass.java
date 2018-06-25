import java.util.*;
import java.io.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
        String name = s.next();                 
        //System.out.println("Hi, " + name + ".");    
        int len=name.length();
         //System.out.println("Hi, " + len + ".");    
         char[] ch=new char[len];
         int[] as=new int[len];
         for(int z=0;z<len;z++){
            ch[z]=name.charAt(z); 
           // System.out.println(z+" Ascii, " + (int) ch[z]);
            as[z]=(int) ch[z];
            //System.out.println(z +"ascii" +as[z]);
         }
         
        //  boolean b=(as[0]!=(as[1]-1)) || (as[0]!=(as[1]+1));
        //  System.out.println(b +" bool" +name);
         
         int count=0;
        for(int y=1;y<len;y++){
            if( (as[y-1]==(as[y]-1)) || (as[y-1]==(as[y]+1)) )
               count++;
              // System.out.println(count+" y "+y);
        }
        if(count==len-1)
        System.out.println("YES");
        else
        System.out.println("NO");
        
        }
}
}
