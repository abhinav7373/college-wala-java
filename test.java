package pw.skills;

public class test {
   public static int[] frequencyArrays(int arr[]){
      int ans[] = new int[100005];
      for(int i=0;i<arr.length;i++){
            ans[arr[i]]++;
      }
      return ans;
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("enter size of array");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter element of array");
      for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
  }
  int freq[]=frequencyArrays(arr);
   
  
}
