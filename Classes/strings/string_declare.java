import java.util.*;
public class Main {
    public static void main(String[] args) {
//       character
      char[] ch = {'a','b','c','d'};
      for(int i=0; i<ch.length; i++){
                System.out.println(ch[i]+" ");
      }
// declaring a string
      String s ="Viresh";
      for(int i=0; i<s.length(); i++){
                System.out.println(s.charAt(i)+" ");
      }
    }
// Using user input
  Scanner scan = new Scanner(System.in).useDelimeter("\n");
  String b = scan.next();
  System.out.print(b);
}
