class Employees{
    String name;
    int y;
    String adress;

}
public class oops2 {
    public static void main(String []args){
        Employees person1 = new Employees();
        person1.name="Robert";
        person1.y=1994;
        person1.adress="c-walstreet";
        Employees person2 = new Employees();
        person2.name="Sam";
        person2.y=2000;
        person2.adress="c-walstreet";
        Employees person3 = new Employees();
        person3.name="John";
        person3.y=1999;
        person3.adress="c-walstreet";
        System.out.println("name"+"\t"+"yoj"+"\t"+"Address");
        System.out.println(person1.name+"\t"+person1.y+"\t"+person1.adress);
        System.out.println(person2.name+"\t"+person2.y+"\t"+person2.adress);
        System.out.println(person3.name+"\t"+person3.y+"\t"+person3.adress);
    }
}
