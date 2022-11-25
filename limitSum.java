import java.util.Scanner;
public class limitSum {
    public static int limit(int arr[],int l,int r){
        // int n= arr.length;
        int sum=0;
    //   while(l<r){
        for(int i=l;i<=r;i++){
            sum=sum+arr[i];
        }
    //   }
      return sum;
    }
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//         }
//    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    System.out.println("enter size of array");
    int n=sc.nextInt();
    System.out.println("valuse of L ad R ");
    int l=sc.nextInt();
    int r=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter element of array");
    for(int i=1;i<n+1;i++){
    arr[i]=sc.nextInt();
    }
     int ans = limit(arr,l,r);
     System.out.println(ans);
   }
}
