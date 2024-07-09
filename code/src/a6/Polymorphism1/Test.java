package a6.Polymorphism1;

//多态
//调用成员变量；编译看左边（Animal)，运行看左边（Animal)
//调用成员方法：编译看左边（Animal)，运行看右边(dog)
class Animal {    //父类
    String name = "狗";


    public void show() {
        System.out.println("Animal----show方法");
    }
}

class dog extends Animal {     //子类
    String name = "猫";

    public void show() {
        System.out.println("Dog-----show方法");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a /*（左边）*/= new dog();  /*（右边）*/
        System.out.println(a.name);     //狗
        a.show();                //Dog-----show方法
    }
}
