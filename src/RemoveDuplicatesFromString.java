import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Write a return method that can remove the duplicated values fromString
//Ex: removeDup("AAABBBCCC") ==> ABC
public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String a = "javaava";
        System.out.println("afterRemovedDuplicate(a) = " + afterRemovedDuplicate("javaava"));
        String b = "AAABBBCC";
        System.out.println(removeDup(b));
        String c = "asdfdsssa";
        System.out.println(removeDup2(c));
    }

    //Solution1:
    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);
        return result;
    }

    //Solution 2:
    public static String afterRemovedDuplicate(String word) {
        Set<String> setWords = new LinkedHashSet<>(Arrays.asList(word.split("")));
        //return setWords.toString();  it returns as array
        return String.join("", setWords);// this will return as a word after remove duplicate;
    }

    //Solution 3:
    public static String removeDup2(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", ", "").replace("[", "").replace("]", "");
        return str;
    }
}