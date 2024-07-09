package a7.oop_interface1;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("兔子吃东西");
    }

}
