package a11.Search_Mysort;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {1, 3, 5, 4, 2, 6};
        BubbleSort(arr);
    }

    private static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
            System.out.print(Arrays.toString(arr));
    }


}
