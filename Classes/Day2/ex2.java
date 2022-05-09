// "static void main" must be defined in a public class.
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l=scan.nextInt();
        int b=scan.nextInt();
        if(l==b){
            System.out.println("square");    
        }
        else{
            System.out.println("rectangle");
        }        
    }
}
