package Java;
import java.util.Scanner;
public class Armstrong_Q2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    int temp1=n,temp2=n,count=0,sum=0;
    while(temp1!=0) {
        temp1/=10;
        count++;
    }
    while(temp2!=0) {
        int r=temp2%10;
        sum+=Math.pow(r,count);
        temp2/=10;
    }
    if(n==sum) {
        System.out.println(n+" is an Armstrong number");
    }else{
        System.out.println(n+" is not an Armstrong number");

    }
    sc.close();
}
}
    
