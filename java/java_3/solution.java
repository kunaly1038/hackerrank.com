    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
    int a;
      Scanner sc =new Scanner(System.in);
      a=sc.nextInt();
      if(a%2==1)
      {
          System.out.print("Weird");
      }
      else if(a%2==0 && a>=2 && a<=5)
              {
                  System.out.println("Not Weird");
              }
      else if(a%2==0 && a>=6 && a<=20)
              {
                  System.out.println("Weird");
              }
      else if(a%2==0 && a>=20 )
              {
                  System.out.println("Not Weird");
              }
        }
    }
