public class pair1 {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,3};
        int target = 7;
        int count=0;
        for(int j=0;j<arr.length;j++){
        for(int i=j+1;i<arr.length;i++){
            if((arr[j]+arr[i])==target)
            count++;
        }
    }
        System.out.println(count);
    }
}
