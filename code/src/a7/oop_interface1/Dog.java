package a7.oop_interface1;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Swim() {
        System.out.println("狗游泳");
    }

    @Override
    public void eat() {
        System.out.println("狗吃东西");
    }
}
