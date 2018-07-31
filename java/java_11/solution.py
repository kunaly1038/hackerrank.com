import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String reversed="";
        String A=sc.next();
        int x=A.length();
       for(int i=x-1;i>=0;i--)
       {
           reversed=reversed+A.charAt(i);
       }
        if(A.equals(reversed))
        {
            
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}

