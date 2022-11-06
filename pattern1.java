/*
1234567
2345671
3456712
4567123
5671234
 */
public class pattern1 {
    public static void main(String []args){
        for(int i =1;i<=5;i++){
            for(int j=i;j<8;j++){
                System.out.print(j);
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
