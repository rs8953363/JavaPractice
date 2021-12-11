import java.util.List;

public class RemoveGreaterThan {
    public static void main(String[] args) {

    }
    /*
5- Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
*/
    public static String removeIf(List<Integer> lst){
        lst.removeIf(p-> p > 100);
        return lst.toString();
    }
    //2nd solution
    public static void removeVAluesGreaterThanX(List<Integer> lst) {

        for (int i=0; i<lst.size(); i++) {
            if(lst.get(i)>20) {
                lst.remove(i);
                i--;
            }
        }

        System.out.println(lst);

    }
}
