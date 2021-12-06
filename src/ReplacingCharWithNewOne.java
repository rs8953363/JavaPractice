public class ReplacingCharWithNewOne {
    public static void main(String[] args) {

            // replacing the char with the new one
            // first parameter is the current char, second param is the new char
            String str0 = "hello";
            String str2 = "helele";

            String str1 = str0.replaceAll("e", "o");
            System.out.println(str1);


    }
}
