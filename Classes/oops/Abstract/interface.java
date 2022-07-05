interface Animal{
    public abstract void run();
    public abstract void race();

}
class Rabbit implements Animal{
    @Override
    public void run(){
        System.out.println("Fast");
    }
    @Override
    public void race(){
        System.out.println("Looser");
    }

}

public class Main {
    public static void main(String[] args) {
        Rabbit rb = new Rabbit();
        rb.run();
        rb.race();
    }
}
