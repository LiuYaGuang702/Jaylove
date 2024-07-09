package a2.ArrayListDemo;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //定义一个集合，添加字符串，进行遍历
        //创建一个集合
        ArrayList<String> list=new ArrayList<>();

        //添加元素
        list.add("一");
        list.add("二");
        list.add("三");
        list.add("四");
        
        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");
    }
}
