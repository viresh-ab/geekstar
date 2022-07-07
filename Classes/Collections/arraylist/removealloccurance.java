import java.util.*;
public class Main {
        static void removealloccurance(ArrayList a, int t){
            for(int i=0; i<a.size();i++){
                if(a.get(i).equals(t)){
                   a.remove(i);
                }
            }
            System.out.println(a);
        }
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
        ArrayList a = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x =scan.nextInt();
            a.add(x);
        }
        int target = 3;
       removealloccurance(a,target);
    }
}
