import java.util.*;
public class Ex{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks=scan.nextInt();
        if(marks>35){
            System.out.println("Pass");    
        }
        else{
            System.out.println("Fail");
        }        
    }
}
