//W.A.P to find Pascal Triangle 
package Java;
import java.util.Scanner;
public class PascalTriangle_Q17 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number n: ");
    int n=sc.nextInt();
    System.out.println("Pascal Triangle is --> ");
    for(int i=0;i<n;i++) {
        for(int j=0;j<=i;j++) {
            System.out.print((fact(i)/(fact(j)*fact(i-j)))+"\t");
        }
        System.out.println();
    }
    sc.close();
    }
    public static int fact(int x) {
        if(x==0||x==1) {
            return 1;
        }
        return x*fact(x-1);
    }
}
