import java.util.*;
public class Main {
        static int linearsearch(ArrayList a, int t){
            for(int i=0; i<a.size();i++){
                if(a.get(i).equals(t)){
                   return i;
                }
            }
            return -1;
        }
      public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(2,8);
        int target = 3;
        System.out.println(linearsearch(a,target));
    }
}
// ==========================================================================
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(8);
        int target = 3;
        for(int i=0; i<a.size();i++){
            if(a.get(i)==target){
                System.out.println(i);
            }
        }
    }
}
// =====================================================================
import java.util.*;
public class Main {
        static int linearsearch(ArrayList a, int t){
            for(int i=0; i<a.size();i++){
                if(a.get(i).equals(t)){
                   return i;
                }
            }
            return -1;
        }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            int x =scan.nextInt();
            a.add(x);
        }
        int target = 3;
        System.out.println("index: "+linearsearch(a,target));
    }
}
