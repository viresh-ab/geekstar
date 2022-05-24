public class Main {
    static int smallestArray(int[] a){
        // int min=a[0];
        int min=Integer.MAX_VALUE;
           for(int i=0;i<a.length; i++){
               if(a[i]<min)
                   min=a[i];
           }
        return min;
        }
    public static void main(String[] args) {
        int[] a ={2,3,4,5,6};
        int c=smallestArray(a);
        System.out.println(c);
    }
}

///////////////////////////////////////////////////////////

import java.util.Scanner;
public class Example{
   static int Smallest(int[] a, int n){
     int min = Integer.MAX_VALUE;
     for(int i=0; i<n; i++){
       if(a[i]<min){
         min =a[i];
       }
     }
     return min;
   }
  public static void main(String args[]){
    // int[] a={3,4,5,9};
    // int n=a.length;
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int[] a= new int[n];
  for(int i=0; i<n; i++){
    a[i]=scan.nextInt();
  }
    int min =Smallest(a,n);
    System.out.println(min);
	}       
}
