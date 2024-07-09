package a10.IntegerDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerTest1 {
    public static void main(String[] args) {
        /*键盘录入一些1~100之间的整数，并添加到集合中
        直到集合中的所有数据之和大于200为止
         */
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数:");
            String numstr = sc.nextLine();
            int num = Integer.parseInt(numstr);
            //对异常数据过滤
            if (num < 1 || num > 100) {
                System.out.println("数据异常，请重新输入");
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if (sum > 200) {
                System.out.println("总数为" + sum);
                break;
            }

        }

    }

    public static int getSum(ArrayList<Integer> list) {
        int n = 0;
        for (int i = 0; i < list.size(); i++) {
            n += list.get(i);
        }
        return n;
    }
}
