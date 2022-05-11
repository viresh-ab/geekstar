import java.util.*;
public class Main {
    public static void main(String[] args) {
        int c = 0;
        int d = 0;
        int e = 0;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for(int i=1; i<=n; i++){
        if(i%3==0){
            c++;
        }
    }
    System.out.println("counts of 3 "+c);
    for(int i=1; i<=n; i++){
        if(i%5==0){
            d++;
        }
    }
    System.out.println("counts of 5 "+d);
    for(int i=1; i<=n; i++){
        if(i%3==0 && i%5==0){
            e++;
        }
    }
    System.out.println("counts of both 3 & 5 "+e);
}
}
