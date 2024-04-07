//Print the Factorial of a number n
package Java;
import java.util.Scanner;

public class FactOfN_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number n : ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is = "+findFact(n));
        sc.close();
    }
    public static int findFact(int n) {
        int fact=1;
        for(int i=1;i<=n;i++) {
            fact*=i;
        }
        return fact;
    }
}
