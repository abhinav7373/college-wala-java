public class onceRepeat {
    public static int findRepeated(int[] arr){
        for(int j=0;j<arr.length;j++){
            for(int i=j+1;i<arr.length;i++){
                if(arr[j]==arr[i]){
                return arr[j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,6,3,4};
        
        System.out.println(findRepeated(arr));
    }
}
