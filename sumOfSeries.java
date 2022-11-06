import java.util.Scanner;
public class sumOfSeries {
    public static void main(String []args){
        System.out.println("enter no");
        Scanner no = new Scanner(System.in);
        int num = no.nextInt();
        // int original_n = num;
        int ans = 0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                ans = ans-i;
            }
            else{
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}
