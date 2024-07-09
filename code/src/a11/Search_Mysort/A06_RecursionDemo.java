package a11.Search_Mysort;

public class A06_RecursionDemo {
    public static void main(String[] args) {
        //递归1      需求：求1~100的和
        System.out.println(getSum(100));
    }

    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + getSum(number - 1);
        }
    }
}
/*  1                                          1返回给getSum(2-1)
      2+getSum(2-1)                 2+getSum(2-1)返回给getSum(3-1)
      3+getSum(3-1)
      .    .   .
     99+getSum(99-1)
    100+getSum(100-1)
 */