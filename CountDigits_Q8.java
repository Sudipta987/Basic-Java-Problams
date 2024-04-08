//W.A.P to check a number has how many digits.
package Java;
import java.util.Scanner;
public class CountDigits_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        while(temp!=0) {
            temp/=10;
            count++;
        }
        System.out.println(n+" contains "+count+" digits");
        sc.close();
    }

}
