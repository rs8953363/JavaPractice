import java.util.*;

public class MapValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("apple", 1);
        map.put("banana", 3);
        map.put("bananas", 3);
        map.put("grape", 5);
        map.put("orange", 2);
        System.out.println(sortByValue(map));
    }
    /*
        Write a method that can sort the map by values
     */
    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }
}
