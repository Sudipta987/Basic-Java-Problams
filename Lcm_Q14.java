//W.A.P to find LCM between three numbers 
package Java;
import java.util.Scanner;
public class Lcm_Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers a,b&c: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int lar=(a>b && a>c)?a:(b>a && b>c)?b:c;
        while(true) {
            if(lar%a==0 && lar%b==0 && lar%c==0) {
                System.out.println("LCM of "+a+","+b+"&"+c+" is = "+lar);
                break;
            }else{
                lar++;
            }
        }
        sc.close();
    }
}
