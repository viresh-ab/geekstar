import java.util.*;
public class Ex{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks=scan.nextInt();
        if(marks>=65){
            System.out.println("A");    
        }
        else if(marks<65 && marks>45){
            System.out.println("A");    
        }
        else if(marks<45 && marks>35){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }
}
