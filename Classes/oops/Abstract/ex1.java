
abstract class Animal{
    public abstract void run();
    public abstract void race();
}
class Rabbit extends Animal{
    @Override
    public void run(){
        System.out.println("Fast");
    }
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
       Rabbit r = new Rabbit();
        Torrtoile t = new Torrtoile();
        r.run();
        r.race();
        System.out.println("=============================");
        t.run();
        t.race();
    }
}
