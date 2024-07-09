package A23_ThreadTest02;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();

        Thread thread1 = new Thread(my,"坦克");
        Thread thread2 = new Thread(my,"飞机");

        thread1.start();
        thread2.start();
    }
}
