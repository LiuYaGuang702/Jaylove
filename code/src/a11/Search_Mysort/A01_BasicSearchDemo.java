package a11.Search_Mysort;

import java.util.ArrayList;

public class A01_BasicSearchDemo {
     //基本查找/顺序查找
    //   需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
    // 要求:需要考虑数组中元素有重复的可能性
    //{131，127，147，81, 103，23，7，79，81}
    // 我要查找81，想要返回的是所有索引 3   8
     public static void main(String[] args) {
         int[] n={131,127,147,81,103,23,7,79,81};
         int num=81;
         ArrayList<Integer> result = basicSearch(n, num);
         System.out.println(result);
     }
     public static ArrayList<Integer> basicSearch(int[] n, int num){
         //将返回的索引放入集合中，再将集合返回
         ArrayList<Integer> list=new ArrayList<>(); //存入的数据是索引，所以泛型用Integer
         for (int i = 0; i < n.length; i++) {
             if (n[i]==num){
                 list.add(i);
             }
         }
         return list;
     }

}
