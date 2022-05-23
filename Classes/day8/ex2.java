//        * 
//       * * 
//      * * * 
//     * * * * 
//    * * * * * 
//   * * * * * * 
//  * * * * * * * 
// * * * * * * * * 
//  * * * * * * * 
//   * * * * * * 
//    * * * * * 
//     * * * * 
//      * * * 
//       * * 
//        * 
// ///////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            for(int j=n-i; j>1; j-- ){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        int m =n-1;
         for (int i=0; i<m; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=m-1; j>=i; j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
