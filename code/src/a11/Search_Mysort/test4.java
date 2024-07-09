package a11.Search_Mysort;

import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        //插入排序      6,5,38,44
         /*插入排序:
        将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
        遍历无序的数据，将遍历到的元素插入有序序列中适当的位置(从有序索引的末尾往前遍历)，如遇到相同数据，插在后面。
        N的范围: 0~最大索引
         */
        int[] arr = {3, 38, 44, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        //先找到无序数组开始的索引start+1
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                start++;
            } else {
                break;
            }

        }
//        3, 38, 44
//                          5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48
        //遍历无序数组
        for (int i = start + 1; i < arr.length; i++) {
            for (int k = i-1; k >=0 ; k--) {
                if (arr[k+1]<arr[k]){
                    int temp=arr[k+1];
                    arr[k+1]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
