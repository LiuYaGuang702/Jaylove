package a13_mySet;

import java.util.HashSet;

public class A02_HashSetDemo2 {
    public static void main(String[] args) {
        //利用hashset对数据进行去重
        //创建学生对象
        Student s1 =new Student("a",16);
        Student s2 =new Student("b",17);
        Student s3 =new Student("c",18);
        Student s4 =new Student("a",16);
        //创建集合添加对象    添加成功true 失败flase
        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        System.out.println(hs);
    }
}
