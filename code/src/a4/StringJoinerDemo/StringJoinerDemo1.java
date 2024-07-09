package a4.StringJoinerDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号(---)
        StringJoiner sj=new StringJoiner("---");
        ArrayList<String>list=new ArrayList<>();
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        Collections.addAll(list,"ddd","eee");
        //3.打印结果
        System.out.println(sj);  //aaa---bbb---ccc
        System.out.println(list);  //[ddd,eee]
    }
}
