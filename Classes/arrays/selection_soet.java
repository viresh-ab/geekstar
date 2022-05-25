// selection sorting of an array 

public class Main {
  static void staticSort(int[] a){
    for(int j=0; j<a.length; j++){
      int fixed =j;
      for(int i=0; i<a.length-1; i++){
        if(a[fixed]>a[i]){
          int temp = a[i];
        a[i]=a[fixed];
        a[fixed]=temp;
        }
      }
    }
  }
    public static void main(String[] args) {
      int[] a={1,6,2,5,3,7,4};
     staticSort(a);
      for(int i=0; i<a.length; i++){
        System.out.print(a[i]+" ");
      }
    }
}
