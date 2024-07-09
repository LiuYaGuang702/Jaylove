package a1.demo;

import java.util.Scanner;

public class FriendTest {
    public static void main(String[] args) {

        //1.创建对象
        Friend f=new Friend();
        System.out.println("请输入姓名");
        Scanner sc=new Scanner(System.in);
        f.setName(sc.next());
//        f.setName("张三");
        f.setAge(18);
        f.setGender("男");

        System.out.println(f.getName());
        System.out.println(f.getAge());
        System.out.println(f.getGender());

        f.sleep();
        f.eat();
    }
}
