package a1.demo;


public class Friend {
    //成员变量
    private String name;
    private int age;
    private String gender;

    public void setName(String name) { //对内进行赋值，需要参数,不需要返回
        this.name = name;    //把name赋值给成员变量中的name
    }

    public String getName() {    //对外提供name属性，不需要参数
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else System.out.println("非法参数");
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void sleep(){
        System.out.println("正在睡觉...");
    }
    public void eat(){
        System.out.println("正在吃饭...");
    }
}