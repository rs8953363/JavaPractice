import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapStructure {
    public static void main(String[] args) {
        list.add(stringToAdd);
    }

    // map structure should be like this {(The quick : 2), (quick brown : 1), (brown fox : 1) etc..}
    // map structure should be like this {(The quick : 2), (quick brown : 1), (brown
    // fox : 1) etc..}
    // the purpose of using linkedhashmap is to keep it "insertion-ordered"
    Map<String, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < list.size(); i++) {
        @@-49,16 +50,16 @@ public void count(String text) {
            int value = map.get(key);
            value++;
            map.put(key, value);
            //map.put(key, map.get(key) + 1);
            // map.put(key, map.get(key) + 1);

        }
    }
}
//System.out.println(map);
    // System.out.println(map);

    // Get all entries into a set
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//System.out.println(entrySet);
// System.out.println(entrySet);

// Get key and value from each entry
		for (Map.Entry<String, Integer> e : entrySet) {
