abstract class Animal{
    public abstract void run();
    public abstract void race();
    public abstract female(){
        System.out.println("Respect Female rabbit");
    }
}
abstract class Rabbit extends Animal{
    // @Override
    public void run(){
        System.out.println("Fast");
    }
    // @Override
    // public void race(){
    //     System.out.println("Looser");
    // }
}
class Rabbitbaby extends Rabbit{
        @Override
    public void race(){
        System.out.println("Looser");
    }
}
class Torrtoile extends Animal{
    @Override
    public void run(){
        System.out.println("Slow");
    }
    @Override
    public void race(){
        System.out.println("Winner");
    }
}
public class Main {
    public static void main(String[] args) {
// rabbit is abstract class it can not be initilized
       // Rabbit r = new Rabbit();
        Rabbitbaby rb = new Rabbitbaby();
        Torrtoile t = new Torrtoile();
        // r.run();
        // r.race();
        // System.out.println("=============================");
        rb.run();
        rb.race();
        rb.female();
        System.out.println("=============================");
        t.run();
        t.race();
    }
}
