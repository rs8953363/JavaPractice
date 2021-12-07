public class isPalindrome {
    public static void main(String[] args) {

      System.out.println(isPalindrome("clock"));
      System.out.println(isPalindrome("madam"));

      System.out.println(isPalindrome("123321"));
      System.out.println(isPalindrome("45763"));
    }
    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed.equalsIgnoreCase(str);
    }

    static boolean isPalindrome2(int number) {
        // TODO
        // let’s say the number is 123321
        // charAt() >> to be able to use this method, I have to have a string type
        String str = number + "";
        boolean isPalindrome2 = true;
        int low = 0;
        int high = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome2 = false;
                return false;
            }
            low++;
            high--;
        }
        return isPalindrome2;
    }

}
