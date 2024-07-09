package a13_mySet;

import java.util.HashSet;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        //创建set集合并添加元素       无序，不重复，无索引
        Set<String> s = new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        //遍历一
//        Iterator<String> it = s.iterator();
//        while(it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }


        //遍历二   新变量string代表集合中的每一个元素
//        for (String string : s) {
//            System.out.println(string);
//        }


        //遍历三
        s.forEach(str->System.out.println(str));
    }
}
