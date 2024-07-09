package a8.puzzleGame;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(488,430);
        this.setTitle("登录");   //设置界面标题
        this.setAlwaysOnTop(true);  //设置界面是否置顶
        this.setLocationRelativeTo(null);  //设置页面居中
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setVisible(true);
    }
}
