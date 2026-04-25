import java.util.Scanner;
public class SecLast {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit1=n/10;
       int digit=digit1%10;
       System.out.println(digit);
    }
}