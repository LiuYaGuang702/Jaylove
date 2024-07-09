package a10.IntegerDemo;

import java.util.Scanner;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入统一用line    特点是遇到回车结束
        String line = sc.nextLine();
        System.out.println(line);
        //把输入的数据转换为整数或者小数类型
        int i = Integer.parseInt(line);
        double v = Double.parseDouble(line);

    }
}
