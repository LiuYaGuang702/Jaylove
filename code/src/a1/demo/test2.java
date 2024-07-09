package a1.demo;

public class test2 {
    public static void main(String[] args) {
        //复制数组   定义一个方法将3，4，5，6元素复制到新数组中并返回
        //1.定义一个原始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //2.调用方法
        int[] copyarr = copyOfRange(arr, 2, 6);
        //3.遍历打印
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newarr = new int[to - from];
        int j = 0; //新数组索引
        //将所需元素复制到新数组中
        for (int i = from; i < to; i++) {
            newarr[j] = arr[i];
            j++;
        }
        return newarr;
    }
}
