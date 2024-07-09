package a1.demo;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数为0~100之间的整数
        //选手的最后得分为去掉最高分和最低分后四个评委的平均分
        //1.定义一个数组存储6名评委的打分0~100
        int[] newScores = getScores();
        for (int i = 0; i < newScores.length; i++) {
            int j=i+1;
            System.out.println(j+"号评委的打分为"+newScores[i]);
        }
        //2.求出最高分
        int max = getMax(newScores);
        System.out.println("最高分为:"+max);
        //3.求出最低分
        int min = getMin(newScores);
        System.out.println("最低分为:"+min);
        //4.求出平均分
        int avg = getAvg(newScores,max,min);
        System.out.println("平均分为:"+avg);
    }

    //获取打分
    public static int[] getScores() {
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分:");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {

                scores[i] = score;
                i++;
            } else
                System.out.println("输入的成绩不合法");
        }
        return scores;
    }

    public static int getMax(int[] newScores) {
        int max =newScores[0];
        for (int i = 1; i < newScores.length; i++) {
            if (newScores[i] > max)
                max = newScores[i];
        }
        return max;
    }

    public static int getMin(int[] newScores) {
        int min = newScores[0];
        for (int i = 1; i < newScores.length; i++) {
            if (newScores[i] < min)
                min = newScores[i];
        }
        return min;
    }

    public static int getAvg(int[] newScores,int max,int min) {
        int sum = 0,avg=0;
        for (int i = 0; i < newScores.length; i++) {
            sum = sum + newScores[i];


        }
        avg=(sum-max-min)/(newScores.length-2);
        System.out.println("总分为"+sum);
        return avg;
    }

}
