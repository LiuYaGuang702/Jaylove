package A18_myreflectDemo1;

import a13_mySet.Student;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
         * 获取class对象的三种方式
         * 1.Class.forName("全类名")
         * 2.类名.class
         * 3.对象.getClass();
         *
         * */

        //第一种方式
        //全类名：包名+类名
        //最常用的
        Class class1 = Class.forName("A18_myreflectDemo1.student");

        //第二种方式
       //一般是更多的当作参数传递
        Class class2 = A18_myreflectDemo1.Student.class;
//     例如在同步代码块中参数需要唯一的对象   synchronized ( student.class)

        //第三种方式
        //当有了这个类的对象才可以使用
        Student s=new Student();
        Class class3 = s.getClass();

        System.out.println(class1==class2);
        System.out.println(class2==class3);

    }

}
