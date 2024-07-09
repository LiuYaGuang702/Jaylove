package a8.puzzleGame.Test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //把一个一维数组中的数据0~15打乱
        //按照四个一组添加到二维数组中
        int temparr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        //获取每个随机数的索引
        for (int i = 0; i < temparr.length; i++) {      //随机数的索引和获取到的数组数据交换
            int index = r.nextInt(temparr.length);
            int temp = temparr[i];
            temparr[i] = temparr[index];
            temparr[index] = temp;
        }
        //遍历数组
        for (int i = 0; i < temparr.length; i++) {
            System.out.print(temparr[i] + " ");
        }
        System.out.println();
        //添加到二维数组
        int Data[][] = new int[4][4];
        int index=0;
        for (int i = 0; i < Data.length; i++) {
            for (int j = 0; j < Data[i].length; j++) {
                Data[i][j] = temparr[index];
                index++;
            }
        }
    }
}
