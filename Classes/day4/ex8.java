import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c=97;
        for(int i=0; i<=4; i++){
            for(int j=0; j<i+1;j++){
                System.out.print((char)c+" ");
            }
            System.out.println();
                            c++;
        }
    }
}
