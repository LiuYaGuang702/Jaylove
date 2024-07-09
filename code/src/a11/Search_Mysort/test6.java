package a11.Search_Mysort;

import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {
        //快速排序
        int[] arr = {3, 6, 2, 7, 9, 1, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int i, int i1) {

    }

//    private static void quickSort(int[] arr, int i, int j) {
//        //定义两个变量表示排序的范围
//        int start = i+1;
//        int end = j;
//        //定义基准数
//        int baseNumber = arr[i];
//        //递归的出口
//        if (start>end){
//            return ;
//        }
//        while (start != end){
//            //先动end，从后往前找，找比基准数小的值
//            while (true){
//                if (start>=end || arr[end]<baseNumber){
//                    break;
//                }
//                end--;
//            }
//            //再动start，从前往后找，找比基准数大的值
//            while (true){
//                if (start>=end || arr[start]>baseNumber){
//                    break;
//                }
//                start++;
//            }
//            //start和end都找到了自己对应的值，交换
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//        }
//        //当start==end时，这时需要将start和基准数进行交换
//        int temp=arr[i];
//        arr[i] = arr[start];
//        arr[start] = temp;
//
//        quickSort(arr,i,start-1);
//        quickSort(arr,start+1,j);
//    }

//    private static void quickSort(int[] arr, int i, int j) {
//        //定义连个变量表示排序的范围
//        int start = i;
//        int end = j;
//        //递归的出口
//        if (start >= end) {
//            return ;
//        }
//        //基准数------要排序范围中的第一个元素
//        int baseNumber = arr[i];
//        //先完成第一轮排序
//        while (start != end) {      //当start不等于end时，start和end还在比对数值
//            //先动end，从后往前找，找比基准数小的值
//            while (true) {
//                if (start >= end || arr[end] < baseNumber) {
//                    break;
//                }
//                end--;
//            }
//            //后动start ,从前往后找，找比基准数大的值
//            while (true) {
//                if (start >= end || arr[start] > baseNumber) {
//                    break;
//                }
//                start++;
//            }
//            //start和end都找到了自己对应的值，交换
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//        }
//        //当start==end时，这时需要将start和基准数进行交换
//        int temp = arr[i];
//        arr[i] = arr[start];
//        arr[start] = temp;
//
//        //排序基准数左边的
//        quickSort(arr, i, start - 1);
//        //排序基准数右边的
//        quickSort(arr, start + 1, j);
//    }
}
