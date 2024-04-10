//W.A.P to convert Decimal to HexaDecimal code 
package Java;
import java.util.Scanner;
public class DecimalToHexaDecimal_Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal code: ");
        int decimal=sc.nextInt();
        System.out.println("Decimal code: "+decimal+" -> Hexa-Decimal code: "+convert(decimal));
        sc.close();
    }
    public static  String convert(int decimal) {
        StringBuilder sb=new StringBuilder();
        int temp=decimal;
        while(temp!=0) {
            int r=temp%16;
            if(r>9 && r<16) {
                switch(r) {
                    case 10 : sb.append('A');
                                break;
                    case 11 : sb.append('B');
                                break;
                    case 12 : sb.append('C');
                                break;
                    case 13 : sb.append('D');
                                break;
                    case 14 : sb.append('E');
                                break;
                    case 15 : sb.append('F');
                                break;
                                
                }
            }else{
            sb.append(r);
            }
            temp/=16;
        }
        int n=sb.length();
        for(int i=0;i<n/2;i++) {
            char first=sb.charAt(i);
            char last=sb.charAt(n-i-1);
            sb.setCharAt(i,last);
            sb.setCharAt(n-i-1,first);
        }
         String str=sb.toString();
       
        return str;
    }
}
