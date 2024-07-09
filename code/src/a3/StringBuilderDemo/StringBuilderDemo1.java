package a3.StringBuilderDemo;

import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //使用StringBuilder的场景
        //1.字符串的拼接 append
        //2.字符串的反转  reverse
        //对称字符串（回文序列）

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.反转字符串
        StringBuilder sb = new StringBuilder();
        sb.append(str);     //添加录入的字符
        sb.reverse();       //反转
        String result= sb.toString();              //将反转后的字符变回字符串进行比较
        System.out.println(result);
        //3.比较
        if(result.equals(str)){
            System.out.println("是对称字符串");
        }else
        System.out.println("不是对称字符串");
    }
}
