/*keep taking numbers as input from user until user enters an odd number */
package Java;
import java.util.Scanner;
public class MenuInput_Q4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int n;
do{
    System.out.println("Enter an input(n): ");
    n=sc.nextInt();
}while(n%2==0);
sc.close();
    
}
}
