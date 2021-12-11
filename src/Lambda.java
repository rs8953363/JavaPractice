import java.util.List;
import java.util.Set;

public class Lambda {
    public static void main(String[] args) {
        lambda1 lmd = p -> {p.equals("name");
            return "name";};
        lambda1 lmd2 = RemovePalindrom::whatever;
        RemovePalindrom rmv = new RemovePalindrom();
        lambda1 lmd3 = RemovePalindrom::whatever1;
    }

    public static String whatever(String str){
        System.out.println(str);
        return "";
    }

    public static String whatever1(String str){
        return str;
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

   // Return intersection From sets:

    public static Set<Object> returnIntersection(Set<Object> set1, Set<Object>set2){
        set2.retainAll(set1);
        return set2;
    }

}