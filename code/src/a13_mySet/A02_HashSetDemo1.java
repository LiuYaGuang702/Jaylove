package a13_mySet;

public class A02_HashSetDemo1 {
    public static void main(String[] args) {
        //哈希表=链表+数组+红黑树

        //重写equals方法
        //如果方法调用者是字符串，则优先看比较的对象是否为字符串，如果不是直接返回false，如果是字符串再比较其内容是否一致
        //如果方法调用者是Object,没有重写equals方法比较的是地址值，重写equals方法后比较的是其属性值（内容）

        //hashcode：将对象计算成哈希值以整数形式表达
        //没有重写hashcode，不同对象计算出的哈希值不同
        //重写hashcode后，不同对象只要属性值相同，其哈希值就相同(除了哈希碰撞)
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("zhangsan", 18);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
