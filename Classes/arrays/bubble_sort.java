// bubble sorting array

public class Main {
    static void bubbleSort(int[] a){
        for(int j=0;j<a.length-1;j++){
            for(int i=0;i<a.length-1-j;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,5,2,6,4};
        bubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        } 
    }
}

// bubble sort for user input

// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
  static void bubbleSort(int[] a){
    for(int j=0; j<a.length-1; j++){
          for(int i=0; i<a.length-1-j; i++){
            if(a[i]>a[i+1]){
              int temp=a[i+1];
              a[i+1]=a[i];
              a[i]=temp;
            }
          }
      }
  }
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] a = new int[n];
      for(int i=0; i<n; i++){
        a[i]=scan.nextInt();
      }
      bubbleSort(a);
      for(int i=0; i<n; i++){
        System.out.print(a[i]+" ");
      }
      
    }
}
