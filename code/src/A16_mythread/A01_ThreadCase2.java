package A16_mythread;

public class A01_ThreadCase2 {
    public static void main(String[] args) {
          /*
        多线程的第二种启动方式
        1.自己定义一个类实现runnable接口
        2.重写run方法
        3.创建自己的类对象
        4.创建Thread类的对象，并启动线程
         */
        //创建自己的类的对象，表示多线程要执行的任务
        Case2_Mythread mr=new Case2_Mythread();

        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        //给线程设置名字
        t1.setName("线程1");
        t2.setName("线程2");
        //启动线程
        t1.start();
        t2.start();
    }
}
