// to print A-z from asci to char

public class Main {
    public static void main(String[] args) {
  
        for(int i=65; i<91; i++){
             char c = (char)i;
            System.out.print(c+" ");
        }
        System.out.println();
        for(int j=97; j<123; j++){
             char b = (char)j;
            System.out.print(b+" ");
        }
        char a='s';
        int b=(int)a;
        System.out.print(b);

    }
}
