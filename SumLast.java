import java.util.Scanner;
public class SumLast {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int digit1=n1%10;
        int digit2=n2%10;
        int sum=digit1+digit2;
        System.out.println(sum);

        

    }
    
}
