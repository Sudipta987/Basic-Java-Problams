//W.A.P to convert Octal code to Decimal code
package Java;
import java.util.Scanner;
public class OctalToDecimal_Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Octal code : ");
        int octal=sc.nextInt();
        System.out.println("Octal code: "+octal+" -> Decimal code: "+convert(octal));
        sc.close();
    }
    public static int convert (int octal) {
        int temp1=octal,sum=0;
        int p=0;
        while(temp1!=0) {
            int r=temp1%10;
            sum+=(Math.pow(8,p)*r);
            p++;
            temp1/=10;
        }
        return sum;
    }
}
