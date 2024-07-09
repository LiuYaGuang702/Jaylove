package a7.oop_interface1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog f=new Frog("青蛙",1);
        System.out.println(f.getName()+","+f.getAge());
        f.eat();
        f.Swim();

        Rabbit r=new Rabbit("兔子",2);
        System.out.println(r.getName()+","+r.getAge());
        r.eat();

        Dog d=new Dog("狗",3);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.Swim();
        Object obj=new Object();
    }
}
