import java.util.Scanner;
public class sumOfdigit {
    public static void main(String []args){
        Scanner no = new Scanner(System.in);
        int num = no.nextInt();
        // int original_n = num;
        int sum = 0;
        System.out.println("enter no");
        while(num>0){
            int rem = num%10;
            num=num/10;
            sum=sum+rem;
        }
        System.out.println("no of digit of sum is "+ num +"="+sum);
    }
}
