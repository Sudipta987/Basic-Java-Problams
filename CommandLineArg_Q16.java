package Java;
import java.util.Scanner;
public class CommandLineArg_Q16 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Sum of "+a+"&"+b+" is = "+(a+b));
        sc.close();
    }
}
