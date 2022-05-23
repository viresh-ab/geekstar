// "static void main" must be defined in a public class.
public class Main {
    static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {   
        System.out.println(add(3,4));
    }
}
