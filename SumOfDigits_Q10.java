package Java;
import java.util.Scanner;
public class SumOfDigits_Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        System.out.println("Sum of Digits is= "+sumOfDigits(n)+" of a number "+n);
        sc.close();
    }
   public static int sumOfDigits(int n) {
        int sum=0;
        int temp=n;
        while(temp!=0) {
            int r=temp%10;
            sum+=r;
            temp/=10;
        }
        return sum;
   }
}
