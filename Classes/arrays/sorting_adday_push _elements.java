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

//push in a sorted array from right in decrement order
public class Main {
    public static void main(String[] args) {
        int[] a= {4,5,3,2,1};
        int j = a.length-4;
        while(j>=0 && a[j]>a[j-1]){
            int temp =a[j-1];
            a[j-1]=a[j];
            a[j]=temp;
            j++;
        }
        int i=0;
        while(i<a.length){
            System.out.print(a[i]+ " ");
            i++;
        }
    }
}

//push in a sorted array from right
public class Main {
    static void push(int[] a){
        for(int i=0; i<a.length; i++){
            int j = i-1;
        while(j>=0 && a[j]>a[j+1]){
            int temp =a[j+1];
            a[j+1]=a[j];
            a[j]=temp;
            j--;
        }
        }
    }
    public static void main(String[] args) {
        int[] a= {4,5,3,2,1};
        
        push(a);
        int i=0;
        while(i<a.length){
            System.out.print(a[i]+ " ");
            i++;
        }
    }
}

//push in a sorted array from right
public class Main {
    static void push(int[] a){
        for(int i=0; i<a.length; i++){
           for(int j=0; j<a.length-1; j++){
               if(a[j]>a[j+1]){
                   int temp =a[j+1];
                   a[j+1]=a[j];
                   a[j]=temp;
               }
        }
    }
    }
    public static void main(String[] args) {
        int[] a= {4,5,3,2,1};
        
        push(a);
        int i=0;
        while(i<a.length){
            System.out.print(a[i]+ " ");
            i++;
        }
    }
}
