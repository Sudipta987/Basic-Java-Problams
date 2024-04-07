//W.A.P to print prime numbers in a range
package Java;
import java.util.Scanner;
public class PrimeRange_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range (x<y): ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int count=0;
        System.out.println("Prime numbers between ("+x+"-"+y+") are -> ");
        for(int i=x;i<=y;i++) {
            count=0;
            for(int j=1;j<=i;j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.print(i+"\t");
            }
        }
        sc.close();
    }
}
