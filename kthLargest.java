import java.util.Arrays;
public class kthLargest { // largest element
    public static int findKth(int arr[],int k){
        Arrays.sort(arr);
        int ans = arr[k];// indexing starts with 0
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1,4,6,8,2,10};
        int k=3;
        int ans = findKth(arr, k);
        System.out.println(ans);

    }
}
}
