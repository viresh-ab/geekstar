import java.util.*;
 class Main {
    public static void main(String[] args) {
    HashMap<Integer, Integer> h = new HashMap<>();
        int[] arr = {5,6,6,6,7,5,5,7,2};
        int n = arr.length;
        for (int i =0; i<n; i++){
            if (h.containsKey(arr[i])){
                int temp = h.get(arr[i]);
                h.put(arr[i], (temp+1));
            }
            else
            {
                h.put(arr[i], 1);
            }
        }

        for (int x : h.keySet()){
            System.out.println(x + " : " + h.get(x));
        }
        }
    }
// ////////////////////////////////////////////////////////////////
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            a.add(scan.nextInt());
        }
        HashMap<Integer,Integer> h =new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a.get(i))){
                h.put(a.get(i),h.get(a.get(i))+1);
            }
            else{
             h.put(a.get(i),1);
            }
        }
        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
// ///////////////////////////////////////////////////////////////
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int maxfreq = Integer.MIN_VALUE;
        ArrayList<Integer> a = new ArrayList<>();
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            a.add(scan.nextInt());
        }
        HashMap<Integer,Integer> h =new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a.get(i))){
                h.put(a.get(i),h.get(a.get(i))+1);
            }
            else{
             h.put(a.get(i),1);
            }
        }
        int maxele=-1;
        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            if(e.getValue()>maxfreq){
                maxfreq=e.getValue();
                maxele=e.getKey();
            }
        System.out.println(maxele + " -> " + maxfreq);
    }
}

