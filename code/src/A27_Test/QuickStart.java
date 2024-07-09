package A27_Test;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class QuickStart {
    public static void main(String[] args) {
        MyFrame2 mf2 = new MyFrame2();
        mf2.show();
        mf2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyFrame mf1 = new MyFrame();
        mf1.show();
        mf1.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
