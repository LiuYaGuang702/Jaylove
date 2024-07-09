package a14_myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        //MAP集合的遍历方式
        Map<String,String> map=new HashMap<>();      //<key,value>
        map.put("鲁迅","这句话不是我说的");
        map.put("曹操","不可能，绝对不可能");
        map.put("刘备","接着奏乐接着舞");
        map.put("柯镇恶","看我颜色行事");

        //遍历一 -------通过键找值，获取所有的键存储到单列集合中,再通过map集合中的键找值
        Set<String> key=map.keySet();
        for (String s : key) {
            String value = map.get(s);
            System.out.println(s+"="+value);
        }
        //遍历二    通过键值对对象遍历--------通过一个方法获取所有键值对对象返回给set集合
//        Set<Map.Entry<String,String>> set=map.entrySet();
//        for (Map.Entry<String, String> entryset : set) {
//            System.out.println(entryset);
//        }


        //遍历三
//        map.forEach((key,  value)->System.out.println(key+"="+value));
    }
}
