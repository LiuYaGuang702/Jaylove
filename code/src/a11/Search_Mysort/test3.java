package a11.Search_Mysort;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {1, 3, 5, 4, 6, 2};
        selection(arr);
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            Arrays.toString(arr);
        }
    }

}
