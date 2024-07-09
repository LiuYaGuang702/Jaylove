package A24_ThreadTest03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();


        //创建此对象既可以作为线程对象的参数，也可以调用get获得线程结果
        FutureTask ft = new FutureTask<>(mc);

        Object o = ft.get();

        Thread thread = new Thread(ft);
        thread.start();

        System.out.println(o.toString());
    }
}
