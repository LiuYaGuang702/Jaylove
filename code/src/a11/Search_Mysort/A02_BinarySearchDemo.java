package a11.Search_Mysort;

public class A02_BinarySearchDemo {
    //二分查找/折半查找
   //核心: 每次排除一半的查找范围  ，，前提是数据必须是有序的
   //需求: 定义一个方法利用二分查找，查询某个元素在数组中的索引
    // 数据如下: [7，23，79，81，103，127，131，147}
    public static void main(String[] args) {
        int[] arr={7,23,46,67,81,127,131,147};
        int num=131;
        System.out.println(BinarySearch(arr, num));
    }
    public static int  BinarySearch(int[] arr, int num){
        //记录两端和中间的的索引
        int min =0;
        int max=arr.length-1;

        //如果min>max，则表示所要查找的数据不存在
        while (true) {
            int mid=(min+max)/2;
            if(min>max){
                System.out.println("数据不存在");
                System.exit(0);
            } else if (arr[mid]>num) {    //此表示查找的数据在中间索引的左边，将右边舍弃
                 max=mid-1;
            } else if (arr[mid]<num) {   //此表示查找的数据在中间索引的右边，将左边舍弃
                min=mid+1;
            }else
                return mid;
        }
    }

}
