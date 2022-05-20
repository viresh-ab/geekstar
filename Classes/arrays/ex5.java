// java array initilizing and assigning elements using for loop
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a= new int[n];
        int[] b= new int[n];
        // int[] c= new int[];
        for(int i=0; i<n; i++){
            a[i]=scan.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=scan.nextInt();
        }
        System.out.print("Array a elements are: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Array b elements are: ");
        for(int i=0; i<n; i++){
            System.out.print(b[i]+" ");
        }
        
        
    }
}
