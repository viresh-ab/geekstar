import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int[] a = new int[n+1];
      int f=1;
      a[0]=1;
      for(int j=1; j<n; j++){
        f=f*j;
        a[j]=f;
      }
      for(int i=0; i<a.length; i++){
           System.out.print(a[i]+" ");
      }
       System.out.println();
      int k=0;
      while(k<a.length){
        System.out.print(a[k]+" ");
            k++;
      }
    }
}
