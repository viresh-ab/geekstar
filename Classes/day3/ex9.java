// wap to print multiple of 7 till n;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for(int i=1; i<=n; i++){
        int c=i*7;
        if(c<=n){
            System.out.println(c);
        }
    }
}
}
