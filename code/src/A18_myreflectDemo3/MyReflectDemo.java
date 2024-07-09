package A18_myreflectDemo3;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws Exception {
//对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
        Student s = new Student("张三", 18, "男", 180, "睡觉");
        Teacher t = new Teacher("李四", 10000);
        saveObject(s);

    }

    public  static void saveObject(Object obj) throws Exception {
        //1.创建字节码文件的对象
        Class<?> class1 = obj.getClass();

        //2.创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IDEA\\IdeaProjects\\basic_code\\code\\src\\A18_myreflectDemo3\\data.txt"));
        //2.获取所有成员变量
        Field[] fields = class1.getDeclaredFields();     //declared表示全部修饰符的成员变量都获取
        for (Field field : fields) {
            field.setAccessible(true);                          //临时取消访问权限
            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(obj);    //成员变量的值跟对象有关，所以传参对象
            //写入文件中
            bw.write(name + " =" + value);
            bw.newLine();   //换行
        }
        bw.close();
    }

}
