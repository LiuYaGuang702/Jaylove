package A17_MythreadTest1;

import java.util.Random;

public class MyThread extends Thread {
    //共享数据
    static double money = 100;
    static int count = 3;
    //最小金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        //四步骤
        //循环
        //同步代码块
        synchronized (MyThread.class) {
            //判断，共享数据是否到了末尾（已经到末尾）
            if (count == 0) {
                System.out.println(getName() + "没有抽到红包");
            } else {
                //判断，共享数据是否到了末尾（没有到末尾）
                //定义一个变量 ，表示抽到的金额
                double prize = 0;
                if (count == 1) {     //表示这时是最后一个红包,红包中剩下的钱全部抽到
                    prize = money;
                } else {
                    //表示第一次和第二次抽取
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;   //每次抽取红包的最大值
                    prize = r.nextDouble(bounds);
                    //如果抽取的数值小于最小值，直接默认抽取到最小值
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }
                //每抽取一次就从总额中减去
                money = money - prize;
                //红包个数依次减一
                count--;
                //打印本次抽取的红包信息
                System.out.println(getName() + "抽取到了" + prize + "元红包");
            }
        }
    }

}
