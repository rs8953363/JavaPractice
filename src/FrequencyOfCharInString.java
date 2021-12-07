import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/*TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for
storage. The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit
comparator is provided.
 */
public class FrequencyOfCharInString {
    public static void main(String[] args) {
        frequencyOfChar(Arrays.asList("inaam","reda","imane","inaam"));
    }

    public static void frequencyOfChar(List<String> str){
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String each : str) {
            if(freq.containsKey(each)){
                freq.put(each,freq.get(each)+1);
            } else {
                freq.put(each,1);
            }
        }
        System.out.println("freq = " + freq);
    }
}

