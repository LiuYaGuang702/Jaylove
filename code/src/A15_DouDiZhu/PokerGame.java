package A15_DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //由于主方法中只要一开始，就会通过空参构造方法创建游戏对象，而准备牌方法和牌盒    只需要创建一次就够了，所有放到构造方法外面
//创建hashmap存储    牌盒
    static HashMap<Integer, String> hm = new HashMap<>();

    static ArrayList<Integer> list = new ArrayList<>();    //

    static {
        //静态代码块：随着类的加载而加载，只执行一次
        //准备牌
        //     "♥", "♣", "♦", "♠"
        //      "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K", "A", "2", "大王", "小王"
        //创建数组存储花色和数字
        String[] color = {"♥", "♣", "♦", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialnumber = 1;
        for (String n : number) {
            //n表示每一种数字
            for (String c : color) {
                //c表示每一种花色
                hm.put(serialnumber, c + n);    //让每一种牌都产生相对应的序号
                list.add(serialnumber);     //再存储序号
                serialnumber++;
            }
        }
        hm.put(serialnumber, "小王");
        list.add(serialnumber);
        serialnumber++;
        hm.put(serialnumber, "大王");
        list.add(serialnumber);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> lord = new TreeSet<>();         //地主的底牌
        TreeSet<Integer> player1 = new TreeSet<>();   //玩家一
        TreeSet<Integer> player2 = new TreeSet<>();   //玩家二
        TreeSet<Integer> player3 = new TreeSet<>();   //玩家三
        //遍历牌盒得到每一张牌先拿出三张底牌，然后剩下的牌发给三位玩家
        for (int i = 0; i < list.size(); i++) {
            //i依次表示集合中的每个元素
            //list.get(i)表示牌的序号
            //前三张牌作为底牌
            if (i <= 2) {
                lord.add(list.get(i));
            }
            //给三位玩家发牌
            if (i % 3 == 0) {
                player1.add(list.get(i));

            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else
                player3.add(list.get(i));
        }
        //看牌
        lookpoker("底牌", lord);
        lookpoker("玩家一", player1);
        lookpoker("玩家二", player2);
        lookpoker("玩家三", player3);
    }

    //参数一：玩家的名字
    //参数二：玩家的手牌
    public void lookpoker(String name, TreeSet<Integer> ts) {
        //遍历treeset集合得到每一个序号，再用序号到map集合中找到真正的值（牌）
        System.out.print(name + ": ");
        for (Integer serialNumber : ts) {     //遍历lord,player1,player2,player3集合得到牌的序号
            String poker = hm.get(serialNumber);     //获取牌
            System.out.print(poker + "   ");
        }
        System.out.println();
    }
}
