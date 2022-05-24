public class Main {
    static int[] reverse(int[] a){
        int n= a.length-1;
        int[] r=new int[n+1];
    for(int i=0; i<a.length; i++){
        int j =n-i;
        r[i]=a[j];
    }
        return r;
    }
    public static void main(String[] args){
     int[] a = {2,4,6,8,0,9,7,5,3,1};
        int[] revArr = reverse(a);
        for(int i=0;i<revArr.length;i++){
            System.out.print(revArr[i]+" ");
        }
    }
}

////////////////////////////////////////////////////////////

public class Main {
    static void reverse(int[] a, int n){
        int i, k, t;
    for(i=0; i<n/2; i++){
        t=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=t;
    }
    for(k=0; k<n; k++){
     System.out.print(a[k]+" ");   
    }
    }
    public static void main(String[] args){
     int[] a = {2,4,6,8,0,9,7,5,3,1};
     reverse(a, a.length);
    }
}
