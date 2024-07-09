package a1.demo;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {
       /*需求：生成10个1~100之间的随机数存入数组
       1.求出所有数据的和
       2.求所有数据的平均数
       3.统计有多少个数据比平均值小
        */

        //定义数组
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;   //将随机读取的数存入数组中
        }
        //1）求出所有数据的和
        int sum = 0;
        int count = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("所有数据的和为" + sum);
        //2)求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("所有数据的平均数为" + avg);
        //3)统计有多少个数据比平均值小
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < avg) {
                count++;
            }
        }
        System.out.println("共有" + count + "个数据比平均值小");
    }
}
