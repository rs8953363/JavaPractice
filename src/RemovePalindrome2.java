import java.util.List;

public class RemovePalindrome2 {
    public static void main(String[] args) {
    }

    public static List<String> removePalindrome(List<String> strs) {
        // 1
        for (int x = 0; x < strs.size(); x++) {
            boolean isP = true;
            String s = strs.get(x);

            for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    isP = false;
                    break;
                }
            }

            if (isP) {
                strs.remove(s);
                x--;
            }
        }
    }
}