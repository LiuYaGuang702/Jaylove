package a13_mySet;

import java.util.Iterator;
import java.util.TreeSet;

public class A04_TreeSetDemo1 {
    public static void main(String[] args) {
        //需求：利用treeset存储整数据并排序
        //排序方法：对于integer和double  默认按照从小到大的顺序
        //对于字符，字符串类型   ，按照字符在ASCII表的数字升序排列
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(5);
        ts.add(4);
        ts.add(2);
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);
        }

       //      ts.forEach( n ->System.out.println(n));
    }
}
