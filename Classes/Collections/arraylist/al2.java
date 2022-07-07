import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add("viresh");
        a.add("varsha");
        a.add("prateek");
        a.add("saumya");
        a.add(2,"meera");
        System.out.println(a);
//         to remove the elements
        a.remove("varsha");
//         to print line by line
        for(Object o: a){
            System.out.println(o);
        }
    }
}
