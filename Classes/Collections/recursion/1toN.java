public class Main {
    static void fact(int a){
        if(a==1){
            System.out.println(a);
            return;  
        }
        System.out.println(a);
                fact(a-1);
    }
    public static void main(String[] args) {
        int n=5;
        fact(n);
    }
}
