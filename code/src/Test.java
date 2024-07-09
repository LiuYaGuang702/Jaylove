public class Test {
    public static void main(String[] args) {
        String s = mergeAlternately("abc", "pqrt");
        System.out.println("s = " + s);
    }

    private static String mergeAlternately(String word1, String word2) {
        //先获取两个字符串的最小长度
        int len = Math.min(word1.length(), word2.length());
        String result = "";
        for (int i = 0; i < len; i++) {
            result += word1.charAt(i) + word2.charAt(i);
        }
        result += word1.substring(len) + word2.substring(len);
        return result;
    }
}


