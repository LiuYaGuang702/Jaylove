package A24_ThreadTest03;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {


    @Override
    public Object call() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        return 100;
    }
}
