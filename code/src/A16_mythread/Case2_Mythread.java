package A16_mythread;

public class Case2_Mythread implements Runnable {
    @Override
    public void run() {
//这里不能用Thread类的方法获取线程的名字,但可以获取进程的对象再调用方法获取名字
        Thread tname = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(tname.getName()+"HelloWorld!");
        }

    }
}
