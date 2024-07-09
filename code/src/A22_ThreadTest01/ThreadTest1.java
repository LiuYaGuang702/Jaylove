package A22_ThreadTest01;

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();
        MyThread01 myThread02 = new MyThread01();

        myThread01.start();
        myThread02.start();
        //start方法启动此线程，然后java虚拟机调用此线程的run方法

    }
}
