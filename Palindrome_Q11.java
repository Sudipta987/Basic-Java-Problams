//W.A.P to check a number is Palindrome or not 
package Java;
import java.util.Scanner;
public class Palindrome_Q11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        int temp=n,sum=0;
        while(temp!=0) {
            int r=temp%10;
            sum=sum*10+r;
            temp/=10;
        }
        if(n==sum) {
            System.out.println(n+" is an Palindrome number");
        }else{
            System.out.println(n+" is not an Palindrome number");
        }

        sc.close();
    }
}