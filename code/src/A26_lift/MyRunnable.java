package A26_lift;

public class MyRunnable implements Runnable {
    //有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出。
    //
    //	利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来.

    //共享数据   测试类中MyRunnable只会创建一次
    int count = 100;

    @Override
    public void run() {
        //1.循环
        while(true){
            //2.同步代码块
            synchronized (MyRunnable.class){
                //3.判断共享数据  结束
                if (count<10){
                    break;
                }else {
                    count--;
                    System.out.println(Thread.currentThread().getName()+"正在送出礼品"+"还剩下"+count+"张");
                }
            }
        }
    }
}
