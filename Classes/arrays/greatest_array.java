public class Main {
    static int greatestArray(int[] a){
        int max=a[0];
//                 int max=Integer.MIN_VALUE;
           for(int i=0;i<a.length; i++){
               if(a[i]>max)
                   max=a[i];
           }
        return max;
        }
    public static void main(String[] args) {
        int[] a ={2,3,4,5,6,1};
        int c=greatestArray(a);
        System.out.println(c);
    }
}
