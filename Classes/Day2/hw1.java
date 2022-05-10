// 24 hours time format, good morning!, good evening, Good noight!
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float time = scan.nextFloat();
    if(time<=24){
        if((time>6.00) && (time<12.00)){
            System.out.println("good morning!");
            }
        else if((time>12.00) && (time<16.00)){
            System.out.println("good afternoon!");
            }
        else if((time>16.00) && (time<20.00)){
            System.out.println("good evening!");
            }
        else{
            System.out.println("good night!");
            }
        }
    }
}
