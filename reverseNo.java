import java.util.Scanner;
public class reverseNo {
    public static void main(String []args){
        System.out.println("enter no");
        Scanner no = new Scanner(System.in);
        int num = no.nextInt();
        // int original_n = num;
        int ans = 0;
        while(num>0){
             ans = (ans*10) + (num%10);
            num=num/10;
        }
        System.out.print(ans);
    }
}