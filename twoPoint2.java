public class twoPoint2 {
    public static int[] findPoint(int ans[]){
        // int ans[]=new int[ans.length];
        int start=0;
        int end=ans.length-1;
        while(start<end){
            if(ans[start]%2!=0 && ans[end]%2==0){
                int temp=ans[start];
                ans[start]=ans[end];
                ans[end]=temp;
                start++;
                end--;
            }
        }
            if(ans[start]%2==0){
                start++;
            }
            if(ans[end]%2!=0){
                end--;
            }
        return ans;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int ans[]=findPoint(arr);
        printArray(ans);
    }
}
