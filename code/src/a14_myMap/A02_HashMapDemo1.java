package a14_myMap;

import java.util.HashMap;
import java.util.Set;

public class A02_HashMapDemo1 {
    public static void main(String[] args) {
/*
        需求: 创建一个HashMap集合，键是学生对象(student)，值是籍贯(string)。
        存储三个键值对元素，并遍历
        要求:同姓名，同年龄认为是同一个学生
*/
        //核心点:    hashmap的键位置如果存储的是自定义对象，需要重写equals和hashcode方法
      Student s1=new Student("张三",16);
      Student s2=new Student("李四",18);
      Student s3=new Student("王五",17);
        //创建hashmap集合
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(s1,"北京");
        hm.put(s2,"天津");
        hm.put(s3,"上海");
        //遍历集合
//        hm.forEach(new BiConsumer<Student, String>() {
//            @Override
//            public void accept(Student student, String s) {
//                System.out.println(student+"籍贯是"+s);
//            }
//        });

        Set<Student> keys= hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key+"籍贯是"+value);
        }
    }
}
