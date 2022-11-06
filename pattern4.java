/*
    1
   121
  12321
 1234321
 */

public class pattern4 {
    public static void main(String []args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
