public class Main {
    static int smallestArray(int[] a){
        // int min=a[0];
        int min=Integer.MAX_VALUE;
           for(int i=0;i<a.length; i++){
               if(a[i]<min)
                   min=a[i];
           }
        return min;
        }
    public static void main(String[] args) {
        int[] a ={2,3,4,5,6};
        int c=smallestArray(a);
        System.out.println(c);
    }
}
