public class PrimeNumber1ToN {
    static void reverseArray(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
          System.out.print(arr[i]+" ") ;
          
        }
        
    }
    
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,67};
       reverseArray(arr);
      
    }
}
