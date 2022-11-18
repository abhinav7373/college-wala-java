public class triplet {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,3};
        int target = 12;
        int count=0;
        for(int j=0;j<arr.length;j++){
        for(int i=j+1;i<arr.length;i++){
            for(int k=i+1;k<arr.length;k++)
             if((arr[i]+arr[j]+arr[k])==target)
             count++;
        }
    }
        System.out.println(count);
    }
}
