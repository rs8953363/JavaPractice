public class SumOfDigitsInString {
    // Write a method that can return the sum of the digits in a string
    // Solution:
    public static void main(String[] args) {
    }
        public static int sumOfDigits (String s){
            int total = 0;
            char[] ch = s.toCharArray();
            for (char each : ch) {
                if (Character.isDigit(each)) {
                    total += Integer.valueOf("" + each);
                }
            }
            return total;
        }

}