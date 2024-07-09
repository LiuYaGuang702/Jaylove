package a12_MyList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo1 {
    public static void main(String[] args) {
        //        List系列集合的五种遍历方式:
        //        1.迭代器
        //        2.列表迭代器
        //        3.增强for
        //        4.Lambda表达式
        //        5.普通for循环


        //  创建集合存储元素      list为接口需要用到多态的方式创建集合
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //    1.迭代器
        //    创建迭代器对象
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }


        //2.增强for
        //新定义变量s代表集合中的每一个元素
//        for (String s : list) {
//            System.out.println(s);
//        }


        //3.lambda表达式
        //foreach的底层就是一个循环遍历，依次得到集合中的每一个元素，并把得到的每一个元素传递给accept方法
        //accept方法中的参数s就是集合中的每一个元素，所以在方法中直接打印s就行了

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


//    lambda  ----   list.forEach (s ->System.out.println(s));


        //4.普通for
//        for (int i = 0; i < list.size(); i++) {
//           String s= list.get(i);
//            System.out.println(s);
//        }

        //5.列表迭代器
        //和迭代器一样，但创建的是列表迭代器对象，额外添加了一个方法，在遍历的过程中可以添加元素
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String s = it.next();
            if ("bbb".equals(s)) {
                it.add("qqq");
            }
        }
        System.out.println(list);
    }
}
