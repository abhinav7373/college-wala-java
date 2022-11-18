import java.util.Scanner;
class string{
    int midOfString(String s){
         int i=1;
            int mid=(i+s.length())/2;
            if(mid%2==0){
              
               return(mid+1);
            }
            else{
                return(mid);
            }
        
    }
}
public class oops4as {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        string obj = new string();
        String s = sc.nextLine();
        int ans = obj.midOfString(s);
        System.out.println(ans);

    }
}
