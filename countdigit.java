import java.util.Scanner;
public class countdigit {
    public static void main(String []args){
        Scanner no = new Scanner(System.in);
        int num = no.nextInt();
        // int original_n = num;
        int count = 0;
        System.out.println("enter no");
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("no of digit in"+ num +"="+count);
    }
}