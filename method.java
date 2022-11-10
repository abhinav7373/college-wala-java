class addition{
    int add(int n,int m){
        return(n+m);
    }
}
public class method {
    public static void main(String []args){
        addition obj = new addition();
        int ans=  obj.add(5,9);
        System.out.println(ans);
        System.out.println(Math.sqrt(16));
        System.out.println(Math.floor(5.4));
        System.out.println(Math.ceil(5.6));
    }
}
