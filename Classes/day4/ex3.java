//         * 
//       * * 
//     * * * 
//   * * * * 
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
int n=scan.nextInt();
    for(int i=1; i<=n; i++){
          for(int j=n; j>=i; j--){
                System.out.print("  ");
        } 
         for(int k=1; k<=i; k++){
                System.out.print("* ");
        }
        
         System.out.println();
    }
    }
}