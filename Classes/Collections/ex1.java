
    class Main {
        static void count(String str){
            int[] arr = new int[26];
            for (int i =0; i<str.length();i++){
                    int temp = str.charAt(i) -97;
                    arr[temp] =arr[temp]+ 1;
            }
            for (int i =0; i<arr.length; i++){
                if (arr[i] >0){
                    char ch = (char)(i+97);
                    System.out.println(ch+" "+arr[i]);
                }
            }
        }
        public static void main(String[] args) {
            String str = "abbbbaaaaaa";
           count(str);
        }
    }
