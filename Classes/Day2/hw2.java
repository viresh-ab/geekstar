import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sub1 = scan.nextInt();
    int sub2 = scan.nextInt();
    int sub3 = scan.nextInt();
    int sub4 = scan.nextInt();
    int sub5 = scan.nextInt();
    int total= sub1+sub2+sub3+sub4+sub5;
    float percentage = total/5;
    if((sub1>35)&&(sub2>35)&&(sub3>35)&&(sub4>35)&&(sub5>35)){
        if(percentage>85.00){
            System.out.println("Distinction");
            }
        else if((percentage<85.00) && (percentage>75.00)){
            System.out.println("First Class");
            }
        else if((percentage<75.00) && (percentage>60.00)){
            System.out.println("Second Class");
            }
        else if((percentage<60.00) && (percentage>35)){
            System.out.println("Pass");
            }
        else{
            System.out.println("Fail");
            }
        }
    else{
         System.out.println("Fail");
    }
    }
}
