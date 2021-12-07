public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("telephone"));
    }
    public static String reverseString(String str) {

        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr += str.charAt(i) + "";
        }
        return newStr;
    }
}
