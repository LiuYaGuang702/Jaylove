package a6.Polymorphism2;

public class Test2 {
    public static void main(String[] args) {
//        Person p1 = new Person("老王", 30);
//        Dog d = new Dog("黑",2);
//        p1.keepPet(d, "骨头");
//        d.lookhome();
//
//        Person p2=new Person("老李",40);
//        Cat c=new Cat("黄",1);
//        p2.keepPet(c,"猫粮");
//        c.catchMouse();

        //优化
        Person p = new Person("老王", 30);
        Dog d = new Dog("黑", 2);
        Cat c = new Cat("黄", 1);
        p.keepPet(d, "骨头");
        p.keepPet(c, "猫粮");
    }
}

class Animals {
    private String color;
    private int age;

    public void eat(String something) {
        System.out.println("动物正在吃" + something);
    }

    public Animals() {
    }

    public Animals(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animals {
    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗正在吃" + something);
    }

    public void lookhome() {
        System.out.println("狗正在看家");
    }
}

class Cat extends Animals {
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫正在吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫正在抓老鼠 ");
    }
}

class Person {
    private String name;
    private int age;

//    public void keepPet(Dog d, String something) {
//        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getAge() +
//        "岁的" + d.getColor() + "颜色的狗");
//        d.eat(something);
//    }
//
//    public void keepPet(Cat c, String something) {
//        System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getAge() +
//        "岁的" + c.getColor() + "颜色的猫");
//        c.eat(something);
//    }

    //优化
    public void keepPet(Animals a, String something) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + d.getAge() +
                    "岁的" + d.getColor() + "颜色的狗正在吃" + something);
            d.eat(something);
            d.lookhome();
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + getAge() + "的" + getName() + "养了一只" + c.getAge() +
                    "岁的" + c.getColor() + "颜色的猫正在吃" + something);
            c.eat(something);
            c.catchMouse();
        } else {
            System.out.println("没有这种动物");
        }
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
