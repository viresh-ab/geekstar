// WAP to take input of an array and find the sum & product
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n]; 
        int sum=0;
        int pro=1;
         for(int i=0; i<n; i++){
         a[i]=scan.nextInt();
         }
        for(int i=0; i<n; i++){
            sum = sum+a[i];
//             sum+=a[i];
        }
        for(int i=0; i<n; i++){
            pro = pro*a[i];
//             pro*=a[i];
        }
        System.out.println(sum);
    }
}
