// "static void main" must be defined in a public class.
public class Main {
    static int fact(int a){
        if(a==0 || a==1){
                 return a;   
        }
        return a * fact(a-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
