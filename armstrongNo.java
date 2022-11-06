public class armstrongNo {
    public static void main(String []args){
      int n=153;
        int temp = n;

    int sum=0;
    while(temp>0){
       int r = temp%10;
        temp=temp/10;
        sum = sum + r*r*r;
    }
    if(sum==n){
        System.out.println("n is armstrong");
    }
    else{
        System.out.println("invalid");
    }

}
}