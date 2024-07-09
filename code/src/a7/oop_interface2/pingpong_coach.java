package a7.oop_interface2;

public class pingpong_coach extends Coach implements  speak{
    public pingpong_coach() {
    }

    public pingpong_coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
