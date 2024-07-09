package a10.IntegerDemo;

public class IntegerTest2 {
    public static void main(String[] args) {
            /*实现parseint方法的效果，将字符串形式的数据转成整数
            要求：字符串中只能是数字不能有其他字符
            最少一位，最多十位
            不能以0开头
             */
        //定义一个字符串
        String str = "123456789";
        if (!str.matches("[1,9]\\d[0,9]]")) {    //利用正则表达式过滤异常数据
            System.out.println("数据格式有误");
        }
        System.out.println("数据格式正确");
        //  parseInt方法
//        int i = Integer.parseInt(str);
//        System.out.println(i + 1);
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);  //获取每一个字符
            int n= c-'0';    //字符转换为整型
            sum=sum*10+n;
        }
        System.out.println(sum+1);
    }
}

