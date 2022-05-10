
import java.util.*;
public class Main {
    public static void main(String[] args) {
  Scanner scan= new Scanner(System.in);
        int count =0;
        int n= scan.nextInt();
        for(int i=1; i<=n; i++){
            if(i%3==0){
                count=count+1;
            System.out.print(i);
            }
                                System.out.println();
            System.out.println(count);
        }

    }
}
