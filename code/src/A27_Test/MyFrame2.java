package A27_Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyFrame2 extends JFrame {

    //创建属性
    JLabel labelname;
    JTextField textname;
    JLabel labelage;
    JTextField textage;
    JLabel labelsg;
    JTextField textsg;
    JLabel labeltz;
    JTextField texttz;
    JLabel labeladdress;
    JTextField textaddress;
    JLabel labelschool;
    String[] schools = {"郑州大学", "河南大学", "河南科技大学", "河南工业大学"};
    JComboBox combo1;
    JLabel labeljob;
    String[] xbs = {"计算机科学与技术", "多媒体", "电子信息管理", "计算机维护"};
    JComboBox combo2;
    JButton button1;
    JButton button2, button3, button4, button5;

    JMenuBar bar1;
    JMenu menufile;
    JMenuItem itemopen;
    JMenuItem itemsave;
    JMenuItem itemcolse;
    JMenu menuedit;
    JMenuItem itemxian;
    JMenuItem itemyin;
    JLabel labelxb;

    JList list1;

    public MyFrame2() {
        super();
        setTitle("学生信息管理系统2");
        setSize(380, 300);
        //setResizable(true);
        ImageIcon icon = new ImageIcon("image/winter.jpg");
        Image image1 = icon.getImage();
        setIconImage(image1);
        GridBagLayout gb1 = new GridBagLayout();//网格包布局
        GridBagConstraints gbc = new GridBagConstraints();//约束管理器  管家
        //新建标签
        labelname = new JLabel("姓名");


        labelage = new JLabel("年龄");
        labelsg = new JLabel("身高");
        labeltz = new JLabel("体重");
        labeladdress = new JLabel("家庭住址");
        labelschool = new JLabel("请选择学校");
        //labeljob=new JLabel("请选择专业");
        labelxb = new JLabel("请选择系别");

        //新建文本框
        textname = new JTextField(10);
        textage = new JTextField(10);
        textsg = new JTextField(10);
        texttz = new JTextField(10);
        textaddress = new JTextField(10);

        //新建列表框
        combo1 = new JComboBox(schools);

        list1 = new JList(xbs);

        //新建按钮
        button1 = new JButton("注册");
        button2 = new JButton("删除");
        button3 = new JButton("查询");
        button4 = new JButton("修改");
        button5 = new JButton("清空");

        //菜单栏
        bar1 = new JMenuBar();
        menufile = new JMenu("文件(F)");
        itemopen = new JMenuItem("打开");
        itemsave = new JMenuItem("保存");
        itemcolse = new JMenuItem("关闭");
        menuedit = new JMenu("编辑(E)");
        itemxian = new JMenuItem("显示");
        itemyin = new JMenuItem("隐藏");


        //得到窗口的内容窗格
        Container c1 = getContentPane();
        c1.setLayout(gb1);

        gbc.gridx = 1;//1列
        gbc.gridy = 1;//1行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelname, gbc);
        c1.add(labelname);


        gbc.gridx = 2;//2列
        gbc.gridy = 1;//1行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textname, gbc);
        c1.add(textname);


        gbc.gridx = 3;//3列
        gbc.gridy = 1;//1行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelage, gbc);
        c1.add(labelage);

        gbc.gridx = 4;//1列
        gbc.gridy = 1;//1行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textage, gbc);
        c1.add(textage);


        gbc.gridx = 1;//1列
        gbc.gridy = 2;//2行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelsg, gbc);
        c1.add(labelsg);


        gbc.gridx = 2;//2列
        gbc.gridy = 2;//2行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textsg, gbc);
        c1.add(textsg);


        gbc.gridx = 3;//2列
        gbc.gridy = 2;//2行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labeltz, gbc);

        c1.add(labeltz);


        gbc.gridx = 4;//4列
        gbc.gridy = 2;//2行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(texttz, gbc);
        c1.add(texttz);

        gbc.gridx = 1;//1列
        gbc.gridy = 3;//3行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labeladdress, gbc);
        c1.add(labeladdress);

        gbc.gridx = 2;//2列
        gbc.gridy = 3;//3行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textaddress, gbc);
        c1.add(textaddress);

        gbc.gridx = 1;//1列
        gbc.gridy = 4;//4行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelschool, gbc);
        c1.add(labelschool);

        gbc.gridx = 2;//2列
        gbc.gridy = 4;//4行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(combo1, gbc);
        c1.add(combo1);


        gbc.gridx = 1;//1列
        gbc.gridy = 5;//5行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelxb, gbc);
        //下拉框
        c1.add(labelxb);


        list1.setVisibleRowCount(1);
        JScrollPane jp1 = new JScrollPane(list1);


        gbc.gridx = 2;//2列
        gbc.gridy = 5;//6行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(jp1, gbc);
        c1.add(jp1);

        //按钮

        gbc.gridx = 1;//2列
        gbc.gridy = 7;//7行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button3, gbc);
        c1.add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name1 = textname.getText().trim();
                System.out.println(name1);
                String driver = "com.mysql.cj.jdbc.Driver";
                //定义MySQL数据库的联接地址
                String url = "jdbc:mysql://localhost:3306/sias?user='root';password='root'";
                //声明联接类
                Connection conn = null;
                try {
                    //使用JDBC技术创建数据库联接
                    Class.forName(driver);
                    //使用DriverManager类的getConnection()方法建立联接,第一个字符参数定义用户名,
                    //第二个字符参数定义密码
                    conn = DriverManager.getConnection(url, "root", "root");
                    if (conn != null) {
                        System.out.println("成功联接JDBC数据源.");
                    }
                    Statement stmt = conn.createStatement();
                    String sql1 = "select * from student where name='" + name1 + "'";
                    System.out.println(sql1);
                    ResultSet rs = stmt.executeQuery(sql1);
                    System.out.println(rs);
                    if (rs != null) {
                        if (rs.next()) {
                            String name2 = rs.getString(1);
                            int age1 = rs.getInt("age");
                            int tall1 = rs.getInt(3);
                            int weight1 = rs.getInt(4);
                            String address1 = rs.getString(5);
                            String school1 = rs.getString(6);
                            String depart1 = rs.getString(7);
                            textname.setText(name2);
                            textage.setText(age1 + "");
                            textsg.setText(tall1 + "");
                            texttz.setText(weight1 + "");

                            textaddress.setText(address1);
                            combo1.setSelectedItem(school1);
                            list1.setSelectedValue(depart1, true);
                        } else {
                            JOptionPane.showMessageDialog(null, "not have this man");
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                try {
                    //关闭数据库联接类
                    conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }


            }
        });
        gbc.gridx = 2;//2列
        gbc.gridy = 7;//7行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button1, gbc);
        c1.add(button1);
        button1.addActionListener(new ActionListener() {

                                      public void actionPerformed(ActionEvent e) {
                                          String name1 = textname.getText().trim();
                                          String age1 = textage.getText().trim();
                                          String tall1 = textsg.getText().trim();
                                          String weight1 = texttz.getText().trim();
                                          String address1 = textaddress.getText().trim();
                                          String school1 = (String) combo1.getSelectedItem();
                                          String depart1 = (String) list1.getSelectedValue();

                                          System.out.println(name1);
                                          System.out.println(depart1);

                                          String driver = "com.mysql.jdbc.Driver";
                                          //定义MySQL数据库的联接地址
                                          String url = "jdbc:mysql://localhost:3306/sias?characterEncoding=GBK";
                                          //声明联接类
                                          Connection conn = null;
                                          try {
                                              //使用JDBC技术创建数据库联接
                                              Class.forName(driver);
                                              //使用DriverManager类的getConnection()方法建立联接,第一个字符参数定义用户名,
                                              //第二个字符参数定义密码
                                              conn = DriverManager.getConnection(url, "root", "root");
                                              if (conn != null) {
                                                  System.out.println("成功联接JDBC数据源.");
                                              }

                                              String sql1 = "insert into student(name,age,tall,weight,address,school,depart) values('" + name1 + "'," + age1 + "," + tall1 + ","+weight1+",'" + address1 + "','" + school1 + "','" + depart1 + "')";
                                              System.out.println("sql=" + sql1);

                                              System.out.println(sql1);
                                              Statement stmt = conn.createStatement();
                                              int a = stmt.executeUpdate(sql1);
                                              if (a == 1)
                                                  System.out.println("success insert!");


                                          } catch (Exception ex) {
                                              ex.printStackTrace();
                                          }
                                          try {
                                              //关闭数据库联接类
                                              conn.close();
                                          } catch (Exception ex) {
                                              ex.printStackTrace();
                                          }

                                      }

                                  }


        );

        gbc.gridx = 3;//3列
        gbc.gridy = 7;//7行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button2, gbc);
        c1.add(button2);

        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String name1 = textname.getText().trim();
                System.out.println(name1);

                String driver = "com.mysql.cj.jdbc.Driver";
                //定义MySQL数据库的联接地址
                String url = "jdbc:mysql://localhost:3306/sias?user='root';password='root'";
                //声明联接类
                Connection conn = null;
                try {
                    //使用JDBC技术创建数据库联接
                    Class.forName(driver);
                    //使用DriverManager类的getConnection()方法建立联接,第一个字符参数定义用户名,
                    //第二个字符参数定义密码
                    conn = DriverManager.getConnection(url, "root", "root");
                    if (conn != null) {
                        System.out.println("成功联接JDBC数据源.");
                    }

                    String sql1 = "delete from student where name='" + name1 + "'";
                    System.out.println(sql1);
                    Statement stmt = conn.createStatement();
                    int a = stmt.executeUpdate(sql1);
                    if (a == 1) System.out.println("success delete");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                try {
                    //关闭数据库联接类
                    conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }


            }
        });


        gbc.gridx = 4;//3列
        gbc.gridy = 7;//7行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button4, gbc);
        c1.add(button4);

        button4.addActionListener(new ActionListener() {

                                      public void actionPerformed(ActionEvent e) {
                                          String name1 = textname.getText().trim();
                                          String age1 = textage.getText().trim();
                                          String tall1 = textsg.getText().trim();
                                          String address1 = textaddress.getText().trim();
                                          String school1 = (String) combo1.getSelectedItem();
                                          String depart1 = (String) list1.getSelectedValue();

                                          System.out.println(name1);
                                          System.out.println(depart1);

                                          String driver = "com.mysql.jdbc.Driver";
                                          //定义MySQL数据库的联接地址
                                          String url = "jdbc:mysql://localhost:3306/sias?characterEncoding=GBK";
                                          //声明联接类
                                          Connection conn = null;
                                          try {
                                              //使用JDBC技术创建数据库联接
                                              Class.forName(driver);
                                              //使用DriverManager类的getConnection()方法建立联接,第一个字符参数定义用户名,
                                              //第二个字符参数定义密码
                                              conn = DriverManager.getConnection(url, "root", "root");
                                              if (conn != null) {
                                                  System.out.println("成功联接JDBC数据源.");
                                              }

                                              // String sql1= "insert into student(name,age,tall,address,school,depart) values('"
                                              //   +name1+"',"+age1+","+tall1+",'"+address1+"','"+school1+"','"+depart1+"')";

                                              String sql1 = "update student set name='" + name1 + "',age=" + age1 + ",tall=" + tall1
                                                      + ",address='" + address1 + "',school='" + school1 + "',depart='" + depart1
                                                      + "'" + "where name='" + name1 + "'";

                                              System.out.println(sql1);
                                              Statement stmt = conn.createStatement();
                                              int a = stmt.executeUpdate(sql1);
                                              if (a == 1)
                                                  System.out.println("update insert!");


                                          } catch (Exception ex) {
                                              ex.printStackTrace();
                                          }
                                          try {
                                              //关闭数据库联接类
                                              conn.close();
                                          } catch (Exception ex) {
                                              ex.printStackTrace();
                                          }

                                      }

                                  }


        );



		/*
		 *
		 * JTextField textname;
	JLabel labelage;
	JTextField textage;
	JLabel labelsg;
	JTextField textsg;
	JLabel labeltz;
	JTextField texttz;
	JLabel labeladdress;
	JTextField textaddress;
	JLabel labelschool;
    String[] schools={"郑州大学","河南大学","河南科技大学","河南工业大学"};
	JComboBox combo1;
	JLabel labeljob;
    String[] xbs={"计算机科学与技术","多媒体","电子信息管理","计算机维护"};
	JComboBox combo2;

		 */


        gbc.gridx = 4;//3列
        gbc.gridy = 5;//7行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button5, gbc);
        c1.add(button5);

        button5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textname.setText("");
                textsg.setText("");
                combo1.setSelectedIndex(0);
                list1.setSelectedValue("多媒体", true);
                //list1.setSelectedIndex(1);


            }
        });


        menufile.add(itemopen);
        menufile.add(itemsave);
        menufile.add(itemcolse);
        menuedit.add(itemxian);
        menuedit.add(itemyin);
        bar1.add(menufile);
        bar1.add(menuedit);

        setJMenuBar(bar1);

        //显示
        setVisible(true);
        //show();
    }
}

