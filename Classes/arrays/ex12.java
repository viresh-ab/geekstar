// sum the elements if index vale = element;
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
            if(i==a[i]){
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
