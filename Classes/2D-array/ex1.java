// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
      int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };
//       print 2D array
      for(int j=0; j<3;j++){
      for(int i=0; i<3;i++){
        System.out.print(arr[j][i]+" ");
      }
        System.out.println();
      }
    }
}
