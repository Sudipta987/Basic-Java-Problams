//W.A.P to convert Decimal code to Octal code
package Java;
import java.util.Scanner;
public class DecimalToOctal_Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal code: ");
        int decimal=sc.nextInt();
        System.out.println("Decimal code: "+decimal+" -> Octal code: "+convert(decimal));
        sc.close();
    }
    public static  int convert(int decimal) {
        StringBuilder sb=new StringBuilder();
        int temp=decimal;
        while(temp!=0) {
            int r=temp%8;
            sb.append(r);
            temp/=8;
        }
        int n=sb.length();
        for(int i=0;i<n/2;i++) {
            char first=sb.charAt(i);
            char last=sb.charAt(n-i-1);
            sb.setCharAt(i,last);
            sb.setCharAt(n-i-1,first);
        }
        String str=sb.toString();
        int ans=Integer.parseInt(str);
        return ans;
    }
}
