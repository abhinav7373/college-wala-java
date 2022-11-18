class add{
    int x,y;
add(int a,int b){
    System.out.println("construtor is now calling");
    x=a;
    y=b;
}
int mul(){
    return x*y;
}
}
public class oops3 {
    public static void main(String []args){
          add obj = new add(4, 5);
          System.out.println(obj.mul());
    }
}
