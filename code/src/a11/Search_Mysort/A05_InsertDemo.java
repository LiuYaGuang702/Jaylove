package a11.Search_Mysort;

public class A05_InsertDemo {
    public static void main(String[] args) {
        /*插入排序:
        将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
        遍历无序的数据，将遍历到的元素插入有序序列中适当的位置(从有序索引的末尾往前遍历)，如遇到相同数据，插在后面。
        N的范围: 0~最大索引
         */
        int[] arr = {3, 38, 44, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        //先找到无序数组开始的索引
        int startindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startindex = i;
                System.out.println(startindex+1);     //3
                break;
            }
        }

        for (int i = startindex+1; i <arr.length ; i++) {   //遍历无序数组
            int j=i;     //记录要修改数据的索引
               while (j>0  && arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   j--;
               }















        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
