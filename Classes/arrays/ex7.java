// java arrays - to print alternate array elements
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
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("alternate array elements are: ");
        for(int i=0; i<n; i++){
            if(i%2==0){
             System.out.print(a[i]+" ");   
            }
        }
    }
}
