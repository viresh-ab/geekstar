// count multiples of 3  n 5 for n times

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int count =0;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for(int i=1; i<=n; i++){
         System.out.println(i*3+"   "+i*5);
        count++;
        }
    System.out.println("count"+count);
    }
}
