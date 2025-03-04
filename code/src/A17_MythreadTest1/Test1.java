package A17_MythreadTest1;

public class Test1 {
    public static void main(String[] args) {
        /*
        微信中的抢红包也用到了多线程
        假设:100块，分成了3个红包，现在有5个人去抢
        其中红包是共享数据。5个人是5条线程。
        打印结果如下:
        xXx抢到了xXX元
        XXx抢到了XXX元
        xXX抢到了XXX元
        XXX没抢到
        XxX没抢到
         */

        //创建线程对象
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        MyThread t4=new MyThread();
        MyThread t5=new MyThread();
        //给线程设置名字
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t4.setName("D");
        t5.setName("E");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
