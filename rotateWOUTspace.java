import java.util.Scanner;
// import java.util.Collections;
public class rotateWOUTspace {
    public static void reverse(int arr[],int i,int j){
        while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
        }
    }
    public static void rotatedArray(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element of array");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("enter value of k");
        int k=sc.nextInt();
        rotatedArray(arr,k);
        printArray(arr);
    }
}
