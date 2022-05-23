to print fabonacci numbers
class FibonacciExample1{  
public static void main(String args[])  {    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int i, a=0, b=1, c;
    System.out.print(a+" "+b);
    for(i=2; i<n; ++i){
        c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
    }
}
}
