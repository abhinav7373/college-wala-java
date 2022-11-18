import java.util.Arrays; 
public class kth { 
    public static int[] findKth(int arr[],int k){
        Arrays.sort(arr);
        int arr2[] = {arr[k-1],arr[k]};
        // indexing starts with 0
        return arr2;
        

    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,8,9,6};
        int k=3;
        int ans[] = findKth(arr, k);
        System.out.println("smallest element "+ans[0]);
        System.out.println("largest element "+ans[1]);
    }
}
