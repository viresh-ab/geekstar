// array multiplications;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a= new int[n];
        int[] b= new int[n];
        int[] c= new int[n];
        for(int i=0; i<n; i++){
            a[i]=scan.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=scan.nextInt();
        }
        for(int i=0; i<n; i++){
            c[i]=a[i]*b[i];
        }
        System.out.print("Array a elements are: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.print("multiplied array elements are: ");
        for(int i=0; i<n; i++){
            System.out.print(c[i]+" ");
        }
    }
}
