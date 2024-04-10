//W.A.P to Update a bit  of a number (In Bit Manipulation)
package Java;
import java.util.Scanner;

public class UpdateBit_Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number in Decimal form: ");
        int d=sc.nextInt();
        System.out.println(d+" in Binary: "+decimalToBinary(d));
        System.out.println("Enter the position of the bit which you want to Update(O based positioning): ");
        int pos=sc.nextInt();
        System.out.println("Enter 1 for Set the bit & 0 for clear the bit: ");
        int op=sc.nextInt();
        int bitMask=1<<pos;
        int newNumber;
        if(op==1) {
            newNumber=bitMask|d;
        System.out.println("After Set the bit of: "+d+" the answer in Decimal: "+newNumber+" and in Binary: "+decimalToBinary(newNumber));
        }else if(op==0) {
        int notBitMask=~bitMask;
        newNumber=notBitMask&d;
        System.out.println("After clear the bit of: "+d+" the answer in Decimal: "+newNumber+" and in Binary: "+decimalToBinary(newNumber));
        sc.close();
        }
    }
    public static  int decimalToBinary(int decimal) {
        StringBuilder sb=new StringBuilder();
        int temp=decimal;
        while(temp!=0) {
            int r=temp%2;
            sb.append(r);
            temp/=2;
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
