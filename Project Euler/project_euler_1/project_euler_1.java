import java.util.Scanner;

/**
 *
 * @author kunal
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
         long  N;long N1,N2,N3,SUM;
        int t =sc.nextInt();
        for(int i=0; i<t; i++){
            N=sc.nextInt();
            N--;
            N1=N/3;
            N2=N/5;
            N3=N/15;
            SUM=(3*N1*(N1+1))/2+(5*N2*(N2+1))/2-(15*N3*(N3+1))/2;
            System.out.print(SUM);
        }
    }
    
}
