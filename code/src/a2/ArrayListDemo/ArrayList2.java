package a2.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        //定义一个集合，添加学生对象，进行遍历
        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个学生的信息");
        Student s1=new Student(sc.next(),sc.nextInt());
        System.out.println("请输入第二个学生的信息");
        Student s2=new Student(sc.next(),sc.nextInt());
        System.out.println("请输入第三个学生的信息");
        Student s3=new Student(sc.next(),sc.nextInt());
        // 添加元素
        list.add(s1);   //这里括号里的类型只能添Student类型
        list.add(s2);
        list.add(s3);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
