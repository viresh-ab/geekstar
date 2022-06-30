import java.util.*;
public class Main{
  
  // function call for  sub string words to capitalize
  
  static String subString(String s){
    int n= s.length();
    String b ="";
    for(int i=0; i<n;i++){
    if(i==0){
      b = b + Character.toUpperCase(s.charAt(i));
    }
    else{
      b = b + Character.toLowerCase(s.charAt(i));
    }
  }
   return b;
  }
  
// function call for  make ideal sentence from public class main
  
  static String makeIdealSentence(String sent){
    String[] words = sent.split(" ");
    String idealString ="";
    for(int i=0; i<words.length; i++){
          idealString = idealString + subString(words[i])+" ";
    }
    return idealString;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();

    String ideal=makeIdealSentence(str);
    System.out.println(ideal);
  }
}
