
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
