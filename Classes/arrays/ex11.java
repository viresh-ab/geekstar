// to print odd and even element sum:
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n]; 
        int OddSum=0, EvenSum=0;
         for(int i=0; i<n; i++){
         a[i]=scan.nextInt();
         }
        for(int i=0; i<n; i++){
            if(a[i]%2==0){
                EvenSum+=a[i];
            }
            if(a[i]%2==1){
                OddSum+=a[i];
            }
        }
        System.out.println(OddSum);
        System.out.println(EvenSum);
    }
}
