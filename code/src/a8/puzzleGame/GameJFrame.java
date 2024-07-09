package a8.puzzleGame;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    //继承界面父类
    //1.创建游戏主页面
    int[][] Data = new int[4][4];
    public GameJFrame() {
        initJFrame();   //初始化界面
        initJMenuBar(); //初始化菜单
        initData(); //初始化数据（打乱后）
        initImage();   //初始化图片
}
    private void initImage() {
        //添加图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number= Data[i][j];
                //创建一个图片ImageIcon对象
                //创建一个Jlabel的对象（管理容器）
                JLabel jlabel = new JLabel(new ImageIcon("D:\\IDEA\\IdeaProjects\\basic_code\\code\\image\\animal\\animal3\\"+number+".jpg"));
                //指定图片位置
                jlabel.setBounds(105 * j+83, 105 * i+134, 105, 105);
                //把管理器添加到界面中
                this.getContentPane().add(jlabel);
            }
        }
    }

    private void initJFrame() {
        //创建游戏界面的时候，同时给这个界面设置一些信息，this表示调用方法者的地址，即new GameJFrame();
        this.setSize(603, 680);  //设置界面宽高
        this.setTitle("拼图单机版  v1.0");   //设置界面标题
        this.setAlwaysOnTop(true);  //设置界面是否置顶
        this.setLocationRelativeTo(null);  //设置页面居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式
        this.setVisible(true);   //界面可视化
        this.setLayout(null);//取消默认的居中模式
    }

    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上的两个选项对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于");
        //创建选项中的条目对象
        JMenuItem replayJMenuItem = new JMenuItem("重新游戏");
        JMenuItem reloginJMenuItem = new JMenuItem("重新登录");
        JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");

        JMenuItem accountJMenuItem = new JMenuItem("公众号");
        //将条目对象添加到选项中
        functionJMenu.add(replayJMenuItem);
        functionJMenu.add(reloginJMenuItem);
        functionJMenu.add(closeJMenuItem);

        aboutJmenu.add(accountJMenuItem);
        //将选项对象添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJmenu);
        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initData() {
        //把一个一维数组中的数据0~15打乱
        //按照四个一组添加到二维数组中
        int[] temparr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        //获取每个随机数的索引
        for (int i = 0; i < temparr.length; i++) {      //随机数的索引和获取到的数组数据交换
            int index = r.nextInt(temparr.length);
            int temp = temparr[i];
            temparr[i] = temparr[index];
            temparr[index] = temp;
        }
        //遍历数组
        for (int i = 0; i < temparr.length; i++) {
            System.out.print(temparr[i] + " ");
        }
        System.out.println();
        //添加到二维数组
//        int Data[][] = new int[4][4];
        int index=0;
        for (int i = 0; i < Data.length; i++) {
            for (int j = 0; j < Data[i].length; j++) {
                Data[i][j] = temparr[index];
                index++;
            }
        }
    }
    }

