// greater function
public class Main {
    static int greatest(int a, int b){
            if(a>b){
                return a;
            }
        else{
        return b;
        }
    }
    public static void main(String[] args) {
        int a =4;
        int b=7;
        int c=greatest(a,b);
        System.out.println(c);
    }
}
