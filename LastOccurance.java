public class LastOccurance {
    public static void main(String[] args) {
        int arr[]={5,4,3,5,6,5,8};
        int ans=-1;
        int k=5;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i])
            ans=i;
        }
        System.out.println(ans);
    }
}
