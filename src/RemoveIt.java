import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveIt {
    public static void main(String[] args) {
        System.out.println(removeIt("message"));
    }
    /*
     * I will convert my str into an array
     * then I will loop inside the array
     * and store each iteration inside a hashSet to remove duplicate
     * */

    public static String  removeIt(String str){
        String nondup = "";
        String[] chars = str.split("");
        Set<String> s = new LinkedHashSet<>();
        for (String x : chars)
            s.add(x);

        for (String x : s)
            nondup += x;

        return nondup;
    }
}
