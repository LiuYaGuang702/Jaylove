package a5.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作: 1.登录   2.注册   3.忘记密码   4.退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有此选项");
            }
        }
    }

    //登录功能
    public static void login(ArrayList<User> list) {
        System.out.println("登录");
    }

    //注册功能
    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        //1.用户名要求
        String username ;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            //判断用户名唯一（先判断格式）
            boolean flag1 = cherkusername(list, username);
            if (!flag1) {    //       ！flag1相当于  ！flag1==true
                System.out.println("用户名格式错误，请重新输入");
                //continue;   //此循环结束
            } else {
                System.out.println("用户名格式正确，继续进行校检");   //用户名不重复，进行下一步
                break;
            }
        }
        //2.密码要求
        // 判断密码格式：密码键盘输入两次，必须两次一致才可以进行注册
        String password;
        while (true) {
            System.out.println("请输入密码:");
            String firstpassword = sc.next();
            System.out.println("请再次输入密码");
            password = sc.next();
            if (firstpassword.equals(password)) {
                System.out.println("密码正确，继续校验");
                break;
            } else {
                System.out.println("密码不一致，请重新输入");
                continue;
            }
        }
        //3.身份证要求  键盘录入身份证：长度为18位，不能以0开头，前17位都必须是数字，最后一位可以是数字也可以是大写X或者小写x
        String personID;
        while (true) {
            System.out.println("请输入身份证号码:");
            personID = sc.next();
            boolean flag2 = cherkPersonID(list, personID);
            if (flag2) {
                System.out.println("身份证验证正确");
                break;
            } else {
                System.out.println("身份证错误，请重新输入");
                continue;
            }
        }
        //4.手机号要求   长度为11,不能以0开头,必须都是数字
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号");
            phoneNumber = sc.next();
            boolean flag3 = cherkphoneNumber(list, phoneNumber);
            if (!flag3) {
                System.out.println("身份证验证错误，请重新输入:");
                continue;
            } else {
                System.out.println("手机号验证成功！");
                System.out.println("注册成功！");
                break;
            }
        }

        //创建用户对象存放数据
        //5.把对象存入集合中
        User u = new User(username, password, personID, phoneNumber);
//        u.setUsername(username);
//        u.setPassword(password);
//        u.setPersonID(personID);
//        u.setPhoneNumber(phoneNumber);
        list.add(u);
        //遍历
        printlist(list);

    }



    public static void printlist(ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User user=list.get(i);
            System.out.println(user.getUsername()+","+user.getPassword()+","+user.getPersonID()+","+user.getPhoneNumber());
        }
    }
    public static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            String sname = list.get(i).getUsername();
            if (sname.equals(username)) {
                return false;
            }
        }
        return true;
    }

    public static boolean cherkusername(ArrayList<User> list, String username) {
        //判断用户名长度   长度为3~15
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //代码到这里表示用户名长度符合规则，继续检验其他条件
        //继续校检：只能是数字或字母的组合
        //循环遍历每个字符
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A') || (c <= '9' && c >= '0'))) {  //如果不在范围内返回false
                return false;
            }
        }
        //继续校检：不能是纯数字
        //思路：统计字符串中的字母个数，只要个数大于0就代表不是纯数字
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A')) {
                count++;
                break;
            }
        }
        return count > 0;   //如果count>0返回true，否则返回false
    }

    public static boolean cherkPersonID(ArrayList<User> list, String PersonID) {
        //1.长度要求为18
        int len = PersonID.length();
        if (len != 18) {
            return false;
        }
        //继续校验
        char c = PersonID.charAt(0);
        if (c == '0') {      //不能以0开头
            return false;
        }
        for (int i = 0; i < PersonID.length() - 1; i++) {     //前17位都必须是数字
            char c1 = PersonID.charAt(i);    //获取字符串的每个字符
            if (c1 < '0' || c1 > '9') {
                return false;
            }
        }
        char last = PersonID.charAt(PersonID.length() - 1); //最后一位可以是数字也可以是大写X或者小写x
        if (!((last >= '0' && last <= '9') || last == 'X' || last == 'x')) {
            return false;
        }
        return true;
    }

    public static boolean cherkphoneNumber(ArrayList<User> list, String phoneNumber) {
        //长度为11
        int len = phoneNumber.length();
        if (len != 11) {
            return false;
        }
        //不能以0开头
        char c = phoneNumber.charAt(0);
        if (c == '0') {
            return false;
        }
        //必须都是数字
        int count=0;
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c2 = phoneNumber.charAt(i);
            if ((c2 >= '0' && c2 <= '9')) {
            }else{
                count++;
                break;
            }
        }
        return  !(count>0);
    }


    //忘记密码
    public static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }
}

