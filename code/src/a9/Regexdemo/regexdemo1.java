package a9.Regexdemo;

public class regexdemo1 {
    public static void main(String[] args) {
        //    正则表达式
//    需求
//    请编写正则表达式验证用户输入的手机号码是否满足要求。
//    请编写正则表达式验证用户输入的邮箱号是否满足要求。
//    请编写正则表达式验证用户输入的电话号码是否满足要求
//    验证手机号码13112345678       13712345667      13945679027            139456790271
//    验证座机电话号码020-2324242       02122442      027-42424      0712-3242434
//    验证邮箱号码3232323@qq.com   zhangsan@itcast.cnn   dlei0009@163.com   dlei0009@pci.com.cn
        //1.验证手机号
        String regex1="1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1)); //true

        //2.验证座机电话号码
       //      //d{2,3}表示可以出现2~3次的任意数字
        String regex2="0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("027-42424".matches(regex2));// true

        //3.验证邮箱
        String regex3="\\w+@[\\w&&[^_]]{2,6}(\\.[A-Za-z]{2,3}){1,2}";
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
    }
}
