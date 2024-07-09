package a11.Search_Mysort;

public class test1 {
    public static void main(String[] args) {
        //二分查找
        //核心: 每次排除一半的查找范围  ，，前提是数据必须是有序的
        //需求: 定义一个方法利用二分查找，查询某个元素在数组中的索引
        int[] arr = {1, 23, 45, 49, 67, 79, 124};  //7
        int num = 46;
        System.out.println(BinarySearch(arr, num));
    }

    private static int BinarySearch(int[] arr, int num) {
        //记录开头和结尾的索引
        int start = 0;
        int end = arr.length - 1;
       while (true){
           int mid=(start+end)/2;
           if (start>end){
               System.out.println("没有这个数据");
               return -1;
           }
           else if (num<arr[mid]){
               //要找的数在mid左边,将右边舍弃
               end=mid-1;
           } else if (num>arr[mid]) {
               //相反
               start=mid+1;
           }else return mid;   //找到了
       }
    }


}
