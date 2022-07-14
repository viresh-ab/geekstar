import java.util.*;
 class Main {
    public static void main(String[] args) {
    HashMap<Integer, Integer> h = new HashMap<>();
        int[] arr = {5,6,6,6,7,5,5,7,2};
        int n = arr.length;
        for (int i =0; i<n; i++){
            if (h.containsKey(arr[i])){
                int temp = h.get(arr[i]);
                h.put(arr[i], (temp+1));
            }
            else
            {
                h.put(arr[i], 1);
            }
        }

        for (int x : h.keySet()){
            System.out.println(x + " : " + h.get(x));
        }
        }
    }
