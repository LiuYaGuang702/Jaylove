package A16_mythread;

public class Case1_MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"helloworld");
        }
    }
}
