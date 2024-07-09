package a7.oop_interface2;

public class basketball_sporter extends Sporter {
    public basketball_sporter() {
    }

    public basketball_sporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员打篮球");
    }

}
