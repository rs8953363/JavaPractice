import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/* 2-Write a return method that check if a string is build out of the same letters as another string.
 */
public class TwoStringCheckSameCharacter {
    public static void main(String[] args) {
        String a = "muhammad";
        String b = "mummadah";
        System.out.println("isSameLetter(a,b) = " + isSameLetter("muhammad", "halide"));

    }
    public static boolean isSameLetter(String word1, String word2){
        //Set<String> word3= new TreeSet<String>(Arrays.asList(Arrays.stream(word1.split("")).collect(Collectors.joining())));
        // System.out.println("word3 = " + word3);

        word1 = new TreeSet<String>(Arrays.asList(word1.split(""))).toString();
        word2 = new TreeSet<String>(Arrays.asList(word2.split(""))).toString();

        return word1.equals(word2);
    }

}
