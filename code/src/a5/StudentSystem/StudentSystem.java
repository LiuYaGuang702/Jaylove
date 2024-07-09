package a5.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        //创建学生集合存放数据
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("5.退出系统");
                    System.exit(0);      //停止虚拟机运行
                }
                default -> System.out.println("没有此选项");
            }

        }

    }

    //功能
    //1.添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String id=null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id已存在,请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();

        System.out.println("请输入学生的住址");
        String address = sc.next();
        Student s = new Student(id,name,  age, address);
        System.out.println("执行语句");
        //把学生信息添加到集合中
        list.add(s);
        //提示
        System.out.println("学生信息添加成功");
    }

    //2.删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除学生的id");
        String id=sc.next();
         int index=getindex(list,id);
         if (index>=0){  //index>0表示学号存在，可以删除
             list.remove(index);    //删除id
             System.out.println("id为"+id+"的学生已删除");
         }else {
             System.out.println("id不存在");
         }
    }

    //3.修改学生
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入要修改的学生的id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        int index = getindex(list, id);
        if(index==-1){
            System.out.println("id不存在，请重新输入");
        }else{
            //下面表示id已存在，可以修改内容
            System.out.println("请输入要修改的学生姓名");
            String newname= sc.next();
            list.get(index).setName(newname);  //list.get(index)为学生对象   然后调用setname方法，把修改后的newname放进去
            System.out.println("请输入要修改的学生年龄");
            int newage= sc.nextInt();
            list.get(index).setAge(newage);
            System.out.println("请输入要修改的学生住址");
            String newaddress= sc.next();
            list.get(index).setAddress(newaddress);
            System.out.println("修改成功!");
        }
    }

    //4.查询学生
    public static void queryStudent(ArrayList<Student> list) {
        //如果系统里没有学生
        if (list.size() == 0) {
            System.out.println("当前系统里没有学生信息，请添加后再查询");
        } else {
            System.out.println("id\t\t姓名\t\t年龄\t\t住址\t\t");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId() + "\t\t" + list.get(i).getName() + "\t\t" + list.get(i).getAge() + "\t\t" + list.get(i).getAddress());
            }
        }

    }

    //查询id唯一性
   public  static boolean contains(ArrayList<Student> list,String id){    //需要用到集合和id参数
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i).getId().equals(id)){
               return true;   //   id重复
           }
       }
       return false;    //id不重复
   }

   public static int getindex(ArrayList<Student> list,String id){
       for (int i = 0; i < list.size(); i++) {
           String sid=list.get(i).getId();
           if (sid.equals(id)){      //id存在
               return i;
           }
       }
       return -1;    //id不存在
   }
}