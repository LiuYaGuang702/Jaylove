package A27_Test;

import java.sql.*;

public class MySQLJDBCConnectionDemo {
  public static void main(String[] args) {
    //定义数据库联接的驱动程序
    String driver = " com.mysql.cj.jdbc.Driver";
    //定义MySQL数据库的联接地址
    String url = "jdbc:mysql://localhost:3306/sias?user='root';password='root'";
    //声明联接类
    Connection conn = null;
    try{
      //使用JDBC技术创建数据库联接
      Class.forName(driver);
      //使用DriverManager类的getConnection()方法建立联接,第一个字符参数定义用户名,
      //第二个字符参数定义密码
      conn = DriverManager.getConnection(url, "root", "root");
      if(conn != null){
        System.out.println("成功联接JDBC数据源.");
      }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    try{
      //关闭数据库联接类
      conn.close();
    }catch(Exception ex){
      ex.printStackTrace();
    }
  }
}
