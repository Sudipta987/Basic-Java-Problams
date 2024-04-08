//W.A.P to find GCD between three numbers 
package Java;
import java.util.Scanner;
public class Gcd_Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers a,b&c : ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int sma=(a<b&&a<c)?a:(b<a&&b<c)?b:c;
        int gcd=1;
        for(int i=1;i<=sma;i++) {
            if(a%i==0 && b%i==0 && c%i==0) {
                gcd=i;
            }
        }
        System.out.println("GCD of "+a+","+b+"&"+c+" is = "+gcd);
        sc.close();
    }
}
