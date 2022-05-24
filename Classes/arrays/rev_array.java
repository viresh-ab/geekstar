public class Main {
     static int[] reverse(int[] arr){
        int n = arr.length-1;
        int[] reversedArr = new int[n+1];
        for(int i=0;i<arr.length;i++){
            int j = n-i;
            reversedArr[i] = arr[j];
            //System.out.println(i+" "+j);
        }
        return reversedArr;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,2,1};
        int[] revArr = reverse(arr);
        for(int i=0;i<revArr.length;i++){
            System.out.print(revArr[i]+" ");
    }
    
}
}
