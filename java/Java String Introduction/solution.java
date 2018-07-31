import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int x=A.length();
        int y=B.length();
        System.out.println(x+y);
        char a=A.charAt(0);
        char b=B.charAt(0);
        int z=(a);
        int z2=(b);
        if(z>z2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String xy=A.substring(0, 1).toUpperCase() + A.substring(1);  
        String yx=B.substring(0, 1).toUpperCase() + B.substring(1);    
        System.out.println(xy+" "+yx);   
        
    }
}



