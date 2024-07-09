package a11.Search_Mysort;

public class A07_QuickSortDemo {
    public static void main(String[] args) {

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        QuickSort(arr, 0, arr.length - 1);
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void QuickSort(int[] arr, int i, int j) {
        //定义两个变量记录范围
        int start = i;
        int end = j;
        int baseNumber = arr[i]; // 记录基准数
        if (start >= end) {
            //递归的出口
            return;
        }
        while (start != end) {
            //end
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;   //end在右边找到了小于基准数的数
                }
                end--;    //如果没有找到就一直往左移动
            }
            //start
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;   //start在左边找到了大于基准数的数
                }
                start++;    //如果没有找到就一直往右移动
            }
            //上面两个循环结束，start和end交换数值
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //此时start=end，基准数可以归位  ,将基准数与start/end对应的值交换
        int temp = arr[start];     //这里的arr[i]不能用basenumber代替
        arr[start] = arr[i];
        arr[i] = temp;
        //第一轮循环已经完成      3 1 2 5 4 6 9 7 10 8
        //再将此数组分为6的左边和6的右边，继续用上面的方法排序
        //左边
        QuickSort(arr, i, start - 1);
        //右边
        QuickSort(arr, start + 1, j);
    }
}
