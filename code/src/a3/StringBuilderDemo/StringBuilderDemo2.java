package a3.StringBuilderDemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //定义一个方法，将int数组中的数据按照指定格式拼接成一个字符串返回，调用该方法并返回结果
        //1.定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        //2.调用方法
        String result = arrtostring(arr);
        System.out.println(result);
    }

    public static String arrtostring(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
               sb.append(arr[i]) .append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}