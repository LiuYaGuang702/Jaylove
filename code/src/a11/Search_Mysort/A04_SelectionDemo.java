package a11.Search_Mysort;

public class A04_SelectionDemo {
    public static void main(String[] args) {
        //选择排序 ,从小到大
        int[] arr = {1, 4, 5, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {    //外层循环 ：循环比较的次数，（2，1，4，5都要比较一轮），最后一位数据不需要比较
            for (int j = i + 1; j < arr.length; j++) {   //内层循环：每次都从i后面的数据开始比较，直到最后一位数据
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
