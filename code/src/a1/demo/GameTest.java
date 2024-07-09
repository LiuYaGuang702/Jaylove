package a1.demo;


public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100);    //创建第一个角色
        Role r2 = new Role("鸠摩智", 100);   //创建第二个角色
        //回合制格斗
        while (true) {
            //r1攻击r2
            r1.attack(r2);
            if (r2.getblood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            //r2攻击r1
            r2.attack(r1);
            if (r1.getblood() == 0) {
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}



