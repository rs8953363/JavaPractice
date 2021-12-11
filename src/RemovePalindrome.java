import java.util.List;
import java.util.Set;

public class RemovePalindrome {
    public static void main(String[] args) {

    }
    public static List<String> removePalind(List<String> lst){
        lst.removeIf(p -> palindromChecker(p));
        return lst;
    }

    public static boolean palindromChecker(String str){
        String newstr = "";
        for (int i = str.length() - 1; i >=0 ; i--) {
            newstr += "" + str.charAt(i);
        }
        return newstr.equals(str);
    }
    public static Set<Object> returnIntersection(Set<Object> set1, Set<Object>set2){
        set2.retainAll(set1);
        return set2;
    }

}
