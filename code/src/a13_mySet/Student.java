package a13_mySet;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    //重写equals方法
    //如果方法调用者是字符串，则优先看比较的对象是否为字符串，如果不是直接返回false，如果是字符串再比较其内容是否一致
    //如果方法调用者是Object,没有重写equals方法比较的是地址值，重写equals方法后比较的是其属性值（内容）

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    //hashcode：将对象计算成哈希值以整数形式表达
    //没有重写hashcode，不同对象计算出的哈希值不同
    //重写hashcode后，不同对象只要属性值相同，其哈希值就相同
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
  //按照年龄升序排列
    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();     //this>o,将左右交换     this<=o,不交换
    }
}
