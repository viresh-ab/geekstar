// to print arry from n-1 to 0
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=scan.nextInt();
        }
        System.out.print("Array a elements are: ");
        for(int i=n-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }    
    }
}
