public class isPalindrome {
    public static void main(String[] args) {

      System.out.println(isPalindrome("clock"));
      System.out.println(isPalindrome("madam"));
    }
    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed.equalsIgnoreCase(str);

    }
}
