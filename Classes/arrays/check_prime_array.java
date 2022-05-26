//Count of primes in an array
public class Main {
      static boolean checkPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2)
            return true;
        return false;
    }
    
    public static void main(String[] args) { 
      int [] arr = {1,3,5,6,7,4};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(checkPrime(arr[i])==true)
                count++;
        }
        System.out.print(count);
    }
}
///////////////////////////////////////////////////////////////////////
import java.util.*;
public class Main {
  static boolean checkPrime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2)
            return true;
        return false;
    }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int m= in.nextInt();
      int[] a = new int[m];
      for(int j=0; j<m; j++){
        a[j]=in.nextInt();
      }
      int count = 0; 
       for(int i=0; i<m; i++){
         if(checkPrime(a[i])==true){
         count++;
         }
      }
          System.out.println(count);
    }
}
