package a13_mySet;

import java.util.Iterator;
import java.util.TreeSet;

public class A04_TreeSetDemo2 {
    public static void main(String[] args) {
        //Treeset的两种比较规则
        //1.默认规则：javabean类实现comparable接口指定比较规则
        //2.比较器规则：创建treeset对象时候，传递comparator指定规则


        //需求：将学生对象按照年龄从小到大排列
//        年龄一样的按照姓名排列
        //姓名，年龄相同的视为同一个人
//        默认规则：javabean类实现comparable接口指定比较规则
        Student s1=new Student("a",23);
        Student s2=new Student("b",24);
        Student s3=new Student("c",25);
        TreeSet<Student> ts=new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        Iterator<Student> it = ts.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
    }
}
