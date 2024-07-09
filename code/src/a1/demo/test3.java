package a1.demo;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        /*需求：
        定义方法实现随机产生一个5位的验证码
        验证码格式:
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字
         */
        //1.大写字母和小写字母都放到数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //添加小写字母 a-----97
            if (i < 26) {
                chs[i] = (char) (97 + i);

            } else {
                //添加大写字母 A------65
                chs[i] = (char) (65 + i - 26);

            }
//            System.out.println(chs[i]);
        }

        //2.随机抽取四次
        String result="";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机数的索引
            int randomindex = r.nextInt(chs.length);
//            System.out.println(chs[randomindex]);
            result+=chs[randomindex];
        }
        System.out.println("字母部分为"+result);
        //3.随机抽取一个数字0~9
        Random r1=new Random();
        int number=r1.nextInt(10);
        result+=number;
        System.out.println("验证码为"+result);
    }
}
