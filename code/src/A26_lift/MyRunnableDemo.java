package A26_lift;


public class MyRunnableDemo {

    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();

        //创建两个线程
        Thread t1= new Thread(my);
        Thread t2= new Thread(my);
        t1.setName("刘");
        t1.setName("张");

        t1.start();
        t2.start();
    }

}
