// Check the sorted have duplicate or not?
public class Main {
    static void BubbleSort(int[] a){
        int temp=Integer.MIN_VALUE;
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length-1-i;j++){
            if(a[j]>a[j+1])
               temp = a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,5};    
        BubbleSort(a);
        for(int i=0; i<a.length;i++){
        System.out.println(a[i]+" ");
        }
    }
}
