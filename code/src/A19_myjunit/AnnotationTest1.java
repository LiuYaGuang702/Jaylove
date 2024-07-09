package A19_myjunit;

//        目的：模拟junit框架的设计
/*        需求:     定义若干个方法，只要加了MyTest注解，就会触发该方法执行
 *         分析：
 *           1. 定义一个自定义注解MyTest，只能注解方法，存活范围是一直都在
 *           2.  定义若千个方法，部分方法加上@MyTest注解修饰，部分方法不加
 *           3.模拟一个junit程序，可以触发加了@MyTest注解的方法执行。
 * */

import java.lang.reflect.Method;

public class AnnotationTest1 {
    //    @MyTest
    public void test1() {
        System.out.println("====test1=====");
    }

    @MyTest
    public void test2() {
        System.out.println("====test2=====");
    }

    //    @MyTest
    public void test3() {
        System.out.println("====test3=====");
    }

    @MyTest
    public void test4() {
        System.out.println("====test4=====");
    }

    public static void main(String[] args) throws Exception {
        AnnotationTest1 an=new AnnotationTest1();//创建执行invoke方法所需参数的对象
        //获取字节码对象
        Class<AnnotationTest1> c = AnnotationTest1.class;
        //获取方法的对象
        Method[] methods = c.getMethods();
        //遍历每个方法对象
        for (Method method : methods) {
            //判断方法对象上是否有Mytest注解
            if (method.isAnnotationPresent(MyTest.class)){
                //如果有注解就执行这个方法
                method.invoke(an);
            }
        }


    }
}
