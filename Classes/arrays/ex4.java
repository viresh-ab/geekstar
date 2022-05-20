// java array initilizing and assigning elements using for loop
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scan.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Array elements are: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
