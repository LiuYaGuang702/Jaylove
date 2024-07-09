package a1.demo;

public class test5 {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下：
        第一季度：22,66,44
        第二季度：77,33,88
        第三季度：25,45,65
        第四季度：11,66,99
        要求计算出每个季度的总营业额和全年的总营业额
         */
        //定义二维数组存放数据
        int[][]yeararrarr={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearsum=0;
        for (int i = 0; i < yeararrarr.length; i++) {
            //定义一维数组存放每个季度的数据
            //yeararrarr[i]相当于一维数组
            int[]quarterarr=yeararrarr[i];
            int sum=getSum(quarterarr);
            yearsum=yearsum+sum;
            System.out.println("第"+(i+1)+"季度的营业额为"+sum);

        }
        System.out.println("总营业额为"+yearsum);

    }
    public static int getSum(int[] arr){
        int sum=0;
        //获取每个季度营业额的和
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
