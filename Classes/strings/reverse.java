// reverse string
import java.util.*;
public class Main {
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String u = sc.next();
  for(int i=u.length()-1; i>=0;i--){
  System.out.print(u.charAt(i));
  }
}
}
