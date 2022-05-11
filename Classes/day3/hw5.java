// WAP to count number of pairs in 1-n with sum even
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int sum=0;
    for(int i=1; i<=n; i++){
        if(i%2==0){
            sum+=i;
        }     
    }
    System.out.print(sum);
    }
}
