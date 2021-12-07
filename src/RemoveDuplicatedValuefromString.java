import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatedValuefromString {
    public static void main(String[] args) {
        String a = "javaava";
        System.out.println("afterRemovedDuplicate(a) = " + afterRemovedDuplicate("javaava"));

    }
    public static String afterRemovedDuplicate(String word){
        Set<String> setWords=new LinkedHashSet<>(Arrays.asList(word.split("")));
        //return setWords.toString();  it returns as array
        return String.join("", setWords);// this will return as a word after remove duplicate;
    }
}
