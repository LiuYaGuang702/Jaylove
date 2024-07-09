package a7.oop_interface2;

public class basketball_coach extends  Coach{
    public basketball_coach() {
    }

    public basketball_coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教打篮球");
    }
}
