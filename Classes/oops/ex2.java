
class Human {
    int age;
    String color;
    int weight;
    
    Human(int age, String color, int weight){
    this.age = age;
    this.color = color;
    this.weight = weight;
    }  
}
public class main {
    public static void main(String[] args) {
        Human veer=new Human(26,"white",62);
        Human varsha=new Human(22,"white",54);
      System.out.println("==============Viresh===================");
        System.out.println("Color: "+ veer.color);
        System.out.println("Age: "+veer.age);
        System.out.println("Weight: "+veer.weight); 
      System.out.println("==============Varsha=====================");
        System.out.println("Color: "+ varsha.color);
        System.out.println("Age: "+varsha.age);
        System.out.println("Weight: "+varsha.weight); 
    }
}
