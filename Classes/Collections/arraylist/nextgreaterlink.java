public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);a.add(3);a.add(2);a.add(4);
        for(int i=0; i<a.size();i++){
            int result=-1;
            for(int j=i+1; j<a.size();j++){
               if(a.get(i)<a.get(j)){
               result=a.get(j);
               break;
              }
            }
            System.out.print(result+" ");
        }
    }
}
