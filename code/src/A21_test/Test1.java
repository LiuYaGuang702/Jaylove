package A21_test;

import javax.swing.*;
import java.awt.*;

public class Test1 extends JFrame {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.show();
        test1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public Test1(){
        this.setTitle("Sias");
        this.setSize(600,400);

//        ImageIcon imageIcon = new ImageIcon("D:\\IDEA\\IdeaProjects\\basic_code\\code\\src\\A21_test\\image\\123.ico");
//        Image image = imageIcon.getImage();
//        setIconImage(image);

        JLabel name=new JLabel("姓名");
        JTextField textName=new JTextField(10);
        JLabel password=new JLabel("密码");
        JTextField textPassword=new JTextField(10);
        JButton button1=new JButton("登录");
        // 添加一个 ButtonGroup 来管理 JRadioButton 组件
        ButtonGroup group = new ButtonGroup();

        // 添加两个 JRadioButton 组件
        JRadioButton student = new JRadioButton("学生");
        JRadioButton teacher = new JRadioButton("教师");
        JRadioButton admin = new JRadioButton("管理员");

        // 将两个 JRadioButton 组件添加到 ButtonGroup 中
        group.add(student);
        group.add(teacher);
        group.add(admin);


        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(name);
        contentPane.add(textName);
        contentPane.add(password);
        contentPane.add(textPassword);
        contentPane.add(student);
        contentPane.add(teacher);
        contentPane.add(admin);

        contentPane.add(button1);


        this.setVisible(true);
    }
}

