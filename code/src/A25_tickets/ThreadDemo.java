package A25_tickets;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建两个线程
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
