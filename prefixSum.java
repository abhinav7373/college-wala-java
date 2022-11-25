import java.util.Scanner;
public class prefixSum {
    public static int[] prefix(int arr[]){
        int n=arr.length;
        int pre[]=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1] + arr[i];
        }
        return pre;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    System.out.println("enter size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter element of array");
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }
     int ans[]=prefix(arr);
     printArray(ans);
   }
}