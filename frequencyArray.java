import java.util.Scanner;
public class frequencyArray {
    public static int[] frequencyArrays(int arr[]){
        int ans[] = new int[100005];
        for(int i=0;i<arr.length;i++){
              ans[arr[i]]++;
        }
        return ans;
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
    int freq[]=frequencyArrays(arr);
     System.out.println("enter no of query");
     int q=sc.nextInt();
     while(q>0){
        System.out.println("enter a no for searching in arr");
        int x=sc.nextInt();
        if(freq[x]>0)
        System.out.println("yes");
        else
        System.out.println("no");
        q--;
     }


}
}