to count the duplicste numbers in an array 
import java.util.*;
public class Main {
    public static void main(String[] args) {
    int[] a = {1,1,2,2,3,4,5,6,7,7,7};
    int count = 0;
    for(int i=0; i<a.length-1; i++){
        if(a[i]==a[i+1]){
          count++;
        }
    } 
   System.out.print(count);  
  }
}
