class A{
  static  int x;
}
public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        a1.x = 5;
        System.out.println(a1.x);
          A a2 = new A();
        // // a1.x = 5;
        System.out.println(A.x);
                a1.x = 8;
        System.out.println(a2.x);
    }
}
