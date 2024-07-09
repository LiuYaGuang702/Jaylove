package a13_mySet;

import java.util.LinkedHashSet;

public class A03_LinkedHashSetDemo {
    public static void main(String[] args) {
         //底层基于哈希表，通过双链表添加数据         有序，无重复，无索引
        //如果数据要去重，使用hashset
        //如果数据要去重且有序，则使用linkedhashset
        //创建学生对象
        Student s1 =new Student("a",16);
        Student s2 =new Student("b",17);
        Student s3 =new Student("c",18);
        Student s4 =new Student("a",16);
        //创建集合添加对象    添加成功true 失败flase
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs);
    }
}
