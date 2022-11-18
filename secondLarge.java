import java.util.Arrays;
public class secondLarge {
    public static int findKth(int arr[],int k){
        Arrays.sort(arr);
        int ans = arr[k];// indexing starts with 0
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {0,-2,0,-3,0,-4};
        int k=2;
        int ans = findKth(arr, k);
        System.out.println(ans);

    }
}
