/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 *      例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer( "We Are Happy");
        replaceSpace(str);
    }

    public  static String replaceSpace(StringBuffer str) {
        String _str = str.toString();
        String result = _str.replaceAll(" ", "%20");
         System.out.println(result);
        return result;
    }
}