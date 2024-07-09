package A25_tickets;

public class MyThread extends Thread {
    //一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
    //
    //	请用多线程模拟卖票过程并打印剩余电影票的数量
    //共享数据
    static int tickets = 1000;

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            synchronized (MyThread.class) {
                //3.判断共享数据   票售空
                if (tickets == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tickets--;
                    System.out.println(Thread.currentThread() + "正在售卖！还剩下" + tickets + "张票");
                }
            }
        }
    }
}

