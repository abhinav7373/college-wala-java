import java.util.Scanner;
public class subArray{
    public static boolean findSubArray(int arr[]){
        int n=arr.length;
        int pre[] = new int[n];
        int suf[]=new int[n];
        pre[0]=arr[0];
        suf[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        for(int j=n-2;j>0;j--){
            suf[j]=suf[j-1]+arr[j];
        }
        for(int i=0;i<n;i++){
            if(pre[i]==suf[i+1])
            return true;
        }
    return false;
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
    // System.out.println("valuse of L ad R ");
    // int l=sc.nextInt();
    // int r=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter element of array");
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }
    boolean ans =findSubArray(arr);
    System.out.println(ans);
}
}
