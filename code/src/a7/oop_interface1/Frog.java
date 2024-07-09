package a7.oop_interface1;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("青蛙吃东西");
    }

    @Override
    public void Swim() {
        System.out.println("青蛙游泳");
    }
}
