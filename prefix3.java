import java.util.Scanner;
public class prefix3 {
    public static int limit(int arr[],int l,int r){
        // int n=arr.length;
        int sum=0;
        for(int i=1;i<=r;i++){
            arr[i]=arr[i]+arr[i-1];
        }
         sum=arr[r]-arr[l-1];
        return sum;
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
    System.out.println("valuse of L ad R ");
    int l=sc.nextInt();
    int r=sc.nextInt();
    int arr[]=new int[n+1];
    System.out.println("enter element of array");
    for(int i=1;i<=n;i++){
    arr[i]=sc.nextInt();
    }
     int ans = limit(arr,l,r);
     System.out.println(ans);
   }
}
