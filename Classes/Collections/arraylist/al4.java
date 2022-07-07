import java.util.*;
public class Main {
    public static void main(String[] args) {
//         only to assign double values
        ArrayList<Double> a = new ArrayList<Double>();
        a.add(1.1);
        a.add(2.1);
        a.add(3.1);
        a.add(4.1);
        a.add(5.1);
        a.add(2,8.1);
        System.out.println(a);
//         to remove the elements
        a.remove(2);
//         to print line by line
        for(Object o: a){
            System.out.println(o);
        }
    }
}
