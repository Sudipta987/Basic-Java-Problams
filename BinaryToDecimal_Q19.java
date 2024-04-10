//W.A.P to convert a Binary code to Decimal code
package Java;
import java.util.Scanner;
public class BinaryToDecimal_Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Binary code : ");
        int binary=sc.nextInt();
        System.out.println("Binary code: "+binary+" -> Decimal code: "+convert(binary));
        sc.close();
    }
    public static int convert (int binary) {
        int temp1=binary,sum=0;
        int p=0;
        while(temp1!=0) {
            int r=temp1%10;
            sum+=(Math.pow(2,p)*r);
            p++;
            temp1/=10;
        }
        return sum;
    }
}
