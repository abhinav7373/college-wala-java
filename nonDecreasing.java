public class nonDecreasing {
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
    public static int[] isSorted(int arr[]){
        int n=arr.length;
        int ans[] = new int[n];
        int left=0;
        int right=n-1;
        int k=0;
        while(left<=right){
          if(Math.abs(arr[left])>Math.abs(arr[right])){
            ans[k++]=arr[left]*arr[left];
            left++;
          }
          else{
            ans[k++]=arr[right]*arr[right];
            right--;
          }
        }
        return ans;
    }
    public static void printArray(int arr[]){
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
    }
    public static void main(String []args){
        int arr[]={-10,-5,-2,1,4,9};
        int ans[] = isSorted(arr);
        reverse(ans);
        printArray(ans);
    }
}
