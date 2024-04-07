package Java;
import java.util.Scanner;
public class SumOfNo_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of numbers(x-y): ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=0;
        int small=(x<=y)?x:y;
        int lar;
        if(small==x) {
         lar=y;
        }else{
            lar=x;
        }
        for(int i=small;i<=lar;i++) {
            sum+=i;
        }
        System.out.println("The Sum of the range : ("+small+"-"+lar+") is = "+sum);
    }
}
