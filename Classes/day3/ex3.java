// loops
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=n; i>=0; i--){
            System.out.print(i+" ");
        }
    }
}
