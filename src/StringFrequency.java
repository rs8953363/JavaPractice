import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
    //Write a method that can find the frequency of chaarcters
    public static void main(String[] args) {
        System.out.println(frequency("Hello"));
        System.out.println(frequency("Hellollo"));
    }

    /* loop inside my string and store each iteration as a key
     * store value + 1 as value if already exists
     * store 1 as value if not
     * */
    public static String frequency(String str){
        String newone = "";
        Map<Character,Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        return map.toString();
    }
}

