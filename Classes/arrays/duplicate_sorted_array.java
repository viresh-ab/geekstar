// Check the sorted have duplicate or not?
public class Main {
    static boolean checkDuplicates(int[] a){
        for(int i=0; i<a.length;i++){
            if(a[i]==a[i+1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,3,4,5};
        // for(int i=0; i<a.length;i++){
        // System.out.println(a[i]+" ");
        // }
        boolean isDuplicates = checkDuplicates(a);
        System.out.println(isDuplicates);
    }
}
