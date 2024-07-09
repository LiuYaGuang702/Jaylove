package a13_mySet;

import java.util.Comparator;
import java.util.TreeSet;

public class A05_TreeSetDemo3 {
    public static void main(String[] args) {
        //Treeset的两种比较规则
        //1.默认规则：javabean类实现comparable接口指定比较规则
        //2.比较器规则：创建treeset对象时候，传递comparator指定规则

        //需求:请自行选择比较器排序和自然排序两种方式;
        // 要求:存入四个宁符串，“c”,"ab”,“df",“qwer”
        // 按照长度排序，如果一样长则按照首字母排序
        //创建集合并存入字符串、


//        比较器规则：创建treeset对象时候，传递comparator指定规则
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            //o1:当前要添加的元素
            //o2:表示已经在红黑树存在的元素
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        ts.add("c");
        ts.add("ab");
        System.out.println(ts);
        ts.add("df");
        System.out.println(ts);
        ts.add("qwer");
        System.out.println(ts);
    }
}
