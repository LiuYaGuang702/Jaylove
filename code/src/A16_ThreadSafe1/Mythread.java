package A16_ThreadSafe1;

public class Mythread extends Thread {
    //static表示这个类的所有对象都可以共享ticket数据
    static int ticket = 0;   //0~99
    //锁对象，但是对象一定要是唯一的
    public static final Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在售卖第" + ticket + "张票");
                } else break;
            }
        }
    }
}
