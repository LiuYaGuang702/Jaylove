package a7.oop_interface2;

public class pingpong_sporter extends Sporter implements speak{
    public pingpong_sporter() {
    }

    public pingpong_sporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓运动员学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓运动员说英语");
    }
}
