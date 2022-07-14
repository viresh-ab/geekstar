import java.util.*;
 class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap<>();
// add the elements;
// key,value
        h.put(20,"aaa");
        h.put(21,"bbb");
        h.put(22,"ccc");
        System.out.println(h.size());
        System.out.println(h.get(20));
        System.out.println(h.containsKey(20));
// To change the Value
        h.put(21,"hhh");
// Remove using keys
        System.out.println(h.remove(20));
//         ==================================================
        for (int x : h.keySet()){
            System.out.println(x + " : " + h.get(x));
        }
//         ============================================
        for(Map.Entry<Integer,String> e : h.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
        }
    }
