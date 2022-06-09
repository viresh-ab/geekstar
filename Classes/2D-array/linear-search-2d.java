
// linear search in 2d array
public class Main {
  static int[] linearsearch(int[][] a, int e){
    int n=a.length;
    int m=a[0].length;
    for(int j=0; j<n;j++){
      for(int i=0; i<m;i++){
         if(a[j][i]==e){
           int[] ind={j,i};
           return ind;
         }
      }
      }
    int[] ind={-1,-1};
    return ind;
  }
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int m= scan.nextInt();
      int n= scan.nextInt();
      int ele=5;
      int[][] arr= new int[m][n];
      for(int j=0; j<m;j++){
      for(int i=0; i<n;i++){
       arr[j][i]=scan.nextInt();
      }
      }
      int[] index=linearsearch(arr,ele);
    System.out.println(index[0]+" "+index[1]);
    }
}


/////////////////////////////////////////////////////////////////

// print diagonal2 elements
import java.util.*;
public class Main {
  static int[] diagonals2optimized(int[][] a, int b){
    int n=a.length;
    int m=a[0].length;
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(a[i][j]==b){
            int[] index={i,j};
            return index;
          }
        }
      }
    int[] index={-1,-1};
    return index;
  }
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int m= scan.nextInt();
      int n= scan.nextInt();
      int[][] arr1= new int[m][n];
      for(int j=0; j<m;j++){
      for(int i=0; i<n;i++){
       arr1[j][i]=scan.nextInt();
      }
      }
    int ele=20;
  
      int[] index=diagonals2optimized(arr1, ele);
   for(int i=0; i<index.length;i++){
       System.out.println(index[i]);
      }
    }
}
