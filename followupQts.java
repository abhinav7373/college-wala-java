public class followupQts {
    public static void main(String []args){
    int arr[] = {2,5,6,1,3};
    int n=arr.length;
    for(int i=n-2;i>=0;i--){ 
        arr[i]=arr[i]+arr[i+1];
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}
