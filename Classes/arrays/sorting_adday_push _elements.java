// push element in a sorted array at it's sorted position
public class Main {
    public static void main(String[] args) {
        int[] a= {1,3,5,6,7,4};
        int j = a.length-2;
        while(j>=0 && a[j]>a[j+1]){
            int temp =a[j+1];
            a[j+1]=a[j];
            a[j]=temp;
            j--;
        }
        int i=0;
        while(i<a.length){
            System.out.print(a[i]+ " ");
            i++;
        }
    }
}
