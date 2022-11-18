public class unique {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        for(int j=0;j<arr.length;j++){
        for(int i=j+1;i<arr.length;i++){
             if(arr[j]==arr[i]){
             arr[j]=-1;
             arr[i]=-1;
             }
        }
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=-1){
        System.out.println(arr[i]);
    }
}
        }
}
 