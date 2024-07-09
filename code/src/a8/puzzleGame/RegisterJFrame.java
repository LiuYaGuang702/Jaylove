package a8.puzzleGame;

import javax.swing.*;

public class RegisterJFrame  extends JFrame {
    public RegisterJFrame(){
        initJFrame();
        this.setVisible(true);
    }

    private void initJFrame() {
        //初始化界面
        this.setSize(488,500);
        this.setTitle("注册");   //设置界面标题
        this.setAlwaysOnTop(true);  //设置界面是否置顶
        this.setLocationRelativeTo(null);  //设置页面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式  点击×即虚拟机停止运行  参数等同于3
    }
}
