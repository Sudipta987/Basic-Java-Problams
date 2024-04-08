//W.A.P to find Fibonacci numbers by using loops.
package Java;
import java.util.Scanner;
public class Fibonacci_Q13 {
    public static void main(String[] args) {
       Scanner sc=new  Scanner(System.in);
        System.out.println("Enter a number n : ");
        int n=sc.nextInt();
        int first=0;
        int second=1,next;
        System.out.println("Fibonacci Sequence is : ");
        for(int i=1;i<=n;i++) {
            System.out.print(first+"\t");
             next=first+second;
            first=second;
            second=next;
        }
        sc.close();
    }
}
