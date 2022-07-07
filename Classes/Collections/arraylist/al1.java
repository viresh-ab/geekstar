import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add("viresh");
        a.add("varsha");
        a.add(2,"abhay");
        System.out.println(a);
//         method 2
        System.out.println("=============================================");
        ArrayList b = new ArrayList<>(){
            {add("viresh");add(26);}
        };
        System.out.println(b);
    }
}
