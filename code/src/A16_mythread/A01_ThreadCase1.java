package A16_mythread;

public class A01_ThreadCase1 {
    public static void main(String[] args) {
        /*
        多线程的第一种启动方式
        1.自己定义一个类继承Thread
        2.重写run方法
        3.创建类对象，并启动线程
         */
        Case1_MyThread t1=new Case1_MyThread();
        Case1_MyThread t2=new Case1_MyThread();
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }
}
