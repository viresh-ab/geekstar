// linear search
public class Main {
    static int search(int[] arr, int ele){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={5,1,2,7,4,3};
        int ele=3;
        System.out.println(search(arr,ele));
//         int ind=search(arr,ele);
//         System.out.println(ind);
    }
}
