//W.A.P to convert Celsius to Fahrenhite and Vise-Versa.
package Java;
import java.util.Scanner;
public class CToF_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose what do you want to perform[(1=for C to F) &(2=for F to C)] : ");
        int c=sc.nextInt();
        if(c==1) {
            System.out.println("Enter the value of Celsius: ");
        }else if(c==2) {
            System.out.println("Enter the value of Fahrenheit : ");
        }
        double n=sc.nextDouble();
        switch(c) {
            case 1 : System.out.println("Fahrenhite : "+(n*(9.0/5.0)+32)+" F`");
                        break;
            case 2 : System.out.println("Celsius : "+((n-32)*(5.0/9.0))+" C`");
                        break;
            default : System.out.println("Not an valid input !");
                        break;
        }
        sc.close();
    }
}
