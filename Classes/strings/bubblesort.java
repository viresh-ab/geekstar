// sorting string using bubblesort
import java.util.*;
public class Main {
  static void bubblesort(char[] a){
    for(int i=0; i<a.length-1; i++){
      for(int j=0; j<a.length-1-i; j++){
        if(a[i]>a[i+1]){
          char temp=a[i+1];
          a[i+1]=a[i];
          a[i]=temp;
        }
      }
    }
  }
  static String sortString(String a){
    char[] ch = a.toCharArray();
    bubblesort(ch);
//     String s= new String(ch);
    return new String(ch);
  }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();
      System.out.println(sortString(s));
    }
}
