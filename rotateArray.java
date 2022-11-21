import java.util.Scanner;
public class rotateArray {
    public static int[] rotatedArray(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int ans[] = new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++] = arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
           ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of array");
        for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("enter value of k");
        int k=sc.nextInt();
        int ans[] = rotatedArray(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+"");
        }
    }
}
