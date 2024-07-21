package a11.Search_Mysort;

public class A08_Shell {
    //希尔排序
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5};
        //确定增长量
        int h=1;
        while (h<arr.length/2){
            h=h*2+1;
        }
    }
}
