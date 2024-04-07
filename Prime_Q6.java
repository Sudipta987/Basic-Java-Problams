//W.A.P to check if a number is prime or not
package Java;
import java.util.Scanner;
public class Prime_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println(n+" is an Prime number .");
        }else{
            System.out.println(n+" is not an Prime number .");
        }
        sc.close();
    }
}
