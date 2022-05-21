// WAP to take input of an array and find the sum
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n]; 
        int sum=0;
         for(int i=0; i<n; i++){
         a[i]=scan.nextInt();
         }
        for(int i=0; i<n; i++){
            sum = sum+a[i];
        }
        System.out.println(sum);
    }
}
