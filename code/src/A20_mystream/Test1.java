package A20_mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/*
 *       现在有两个ArrayList集合，分别存储6名男演员的名字和年龄以及6名女演员的名字和年龄。姓名和年龄中间用逗号隔开。
 *        比如:张三,23
 *        要求完成如下的操作:
            1，男演员只要名字为3个字的前两人
            2，女演员只要姓杨的，并且不要第一个
            3，把过滤后的男演员姓名和女演员姓名合并到一起
            4，将上一步的演员姓名封装成Actor对象。
            5，将所有的演员对象都保存到List集合中。
            备注:演员类Actor，属性有:name，age
            男演员:"蔡坤坤,24"  , "叶胸咸,23"，"刘不甜,22"，"吴签,24"，"谷嘉,30"，"肖梁梁,27"
            女演员:"赵小颖,35”，"杨颖,36"，"高元元,43"，"张天天,31"，"刘诗,35"，"杨小幂,33"
 * */
public class Test1 {
    public static void main(String[] args) {
        //1.创建两个arraylist集合
        ArrayList<String> manlist=new ArrayList<>();    //男演员集合
        ArrayList<String> womenlist=new ArrayList<>();   //女演员集合

        //2.添加数据
        Collections.addAll(manlist,"蔡坤坤,24"  , "叶胸咸,23" ,"刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27");
        Collections.addAll(womenlist,"赵小英,35","杨英,36","高远远,43","张天,31","刘时,35","杨密,33");

        //3.男演员只要名字为3个字的前两人
        //s.split获取的是一个数组，0索引表示数组名
        Stream<String> stream1 = manlist.stream()
                .filter(s -> s.split(",")[0].length() == 3)       //名字为3个字
                .limit(2);                                                  //前两个人

        //4.女演员只要姓杨的，并且不要第一个
        Stream<String> Stream2 = womenlist.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))         //姓杨的
                .skip(1);                                                               //跳过第一个人


        //5.把过滤后的男演员姓名和女演员姓名合并到一起,,,,
        // ,,将上一步的演员姓名封装成Actor对象（String-->Actor对象）------map方法
        Stream<Actor> ActorStream = Stream.concat(stream1, Stream2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                //s表示每一个符合条件的字符串    如："蔡坤坤,24"
                String name = s.split(",")[0];    //名字
                int age = Integer.parseInt(s.split(",")[1]);   //年龄----将字符串类型转换为int类型
                return new Actor(name, age);
            }
        });
        //6.将所有的演员对象都保存到List集合中。
        List<Actor> list =ActorStream.toList();
        System.out.println(list);

    }
}
