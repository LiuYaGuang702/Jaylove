package a1.demo;

import java.util.Random;


public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getblood() {
        return blood;
    }

    //定义一个方法用于攻击对方
    //r1攻击r2   r1.attack(r2)   r1调用攻击方法攻击r2的参数
    public void attack(Role role) {    //括号里参数表示调用Role类
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;    //伤害数值为1~20的随机数
        int remainblood = role.getblood() - hurt;   //剩余血量
        remainblood = remainblood < 0 ? 0 : remainblood;   //对剩余血量做验证，如果为负数就修改为0
        role.setBlood(remainblood);  //修改被攻击者血量
        //this 表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成了" + hurt +
                "点伤害,鸠摩智还剩下" + remainblood + "点血");
    }
}

