// * * * * 
//   * * * 
//     * * 
//       * 
    import java.util.*;
    public class Main {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                    System.out.print("  ");
            }
             for(int k=i; k>=1; k--){
                    System.out.print("* ");
            }

             System.out.println();
        }
        }
    }
