package A16_ThreadSafe1;

public class ThreadDemo {
    public static void main(String[] args) {
        //需求： 100张票，三个售票窗口，设计一个程序模拟售票

        //创建窗口对象
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();
        //设置名字
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
       //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
