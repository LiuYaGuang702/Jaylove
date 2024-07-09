package a11.Search_Mysort;

public class test5 {
    public static void main(String[] args) {
        //递归   求1~100的和
        int recursion = recursion(100);
        System.out.println("recursion = " + recursion);
    }

    private static int recursion(int i) {
        if (i==0){
            return 0;
        }
        return i+recursion(i-1);
    }


}
