import java.util.*;
public class Main {
    public static void main(String[] args) {
//         only to assign integer values
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(2,8);
        System.out.println(a);
//         to remove the elements
        a.remove(2);
//         to print line by line
        for(Object o: a){
            System.out.println(o);
        }
    }
}
