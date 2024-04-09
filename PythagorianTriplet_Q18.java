//W.A.P to Check Pythagorean Triplet 
package Java;
import java.util.Scanner;
public class PythagorianTriplet_Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three +ve values a,b&c: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if(checkTriplets(a, b, c)) {
            System.out.println(a+","+b+"&"+c+" is an Pythagorean Triplet");
        }else{
            System.out.println(a+","+b+"&"+c+" is not an Pythagorean Triplet");
        }
        sc.close();
    }
    public static boolean checkTriplets(int a,int b,int c) {
        int x=(a>b&&a>c)?a:(b>c&&b>a)?b:c;
        int y,z;
        if(x==a) {
         y=b; 
         z=c;
        }else if(x==b) {
        y =c;
        z=a;
        }else {
            y=a;
             z=b;
        }
        if(Math.pow(x,2)==(Math.pow(y,2)+Math.pow(z,2))) {
            return true;
        }else{
            return false;
        }
 
    }
}
