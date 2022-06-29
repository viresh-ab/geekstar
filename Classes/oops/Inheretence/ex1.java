class Parent{
    int a=5;
    String name ="Viresh";
}
class Child extends Parent{
    String color = "White";
}
public class Main{
    public static void main(String[] args){
        Child cc = new Child();
        System.out.println(cc.name);
        System.out.println(cc.color);
    }
}
