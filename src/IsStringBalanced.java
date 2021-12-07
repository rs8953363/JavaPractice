import java.util.LinkedHashMap;
import java.util.Map;

public class IsStringBalanced {
    /*
     * Enter a string with [] or () and verify if balanced or not
     * if same number of each special carachter then balanced if not it is not
     * Ex:
     *       if []([])() ==> balanced
     *       if []()[][  ==> not balanced
     */
        public static void main(String[] args) {
            System.out.println("isPair? " + isPair("()()[]"));
        }
        public static String isPair(String str){
            String newStr = "";
            String balanced = "";

            for (int i =0; i<str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '[' || str.charAt(i) == ']'){
                    newStr += str.charAt(i);
                }
            }

            Map<Character,Integer> map = new LinkedHashMap<>();
            for (Character each : newStr.toCharArray()) {
                if(map.containsKey(each)){
                    map.put(each,map.get(each)+1);
                } else {
                    map.put(each, 1);
                }
            }

            for (Integer value : map.values()) {
                if (value > 1) {
                    balanced = "not balanced";
                } else {
                    balanced = "balanced";
                }
            }
            return balanced;
        }

    }
// It can return a boolean, as well
/*
  Collections methods
* add()
* addAll()
* siz()
* isEmpty()
* remove()
* removeAll()
* contains()
* containsAll()
* retainAll()
* removeIf()     --> ex: coll.removeIf(each -> each > 10)
* toArray()
* iterator
*/
/*
  List methods:
* add()
* set()
* remove()
* addAll()
* replaceAll()
* sort()
* reverse: --> lst.sort(Comparator.reverseOrder())
* subList()
* lstIterator()
*/
/*
  Map methods
* put()
* size()
* get(key value)
* isEmpty()
* containsKey()
* containsValue()
* remove()
* clear()
* putIfAbsent()       --> scoreMap.putIfAbsent("Mary",100);
* replace()           --> scoreMap.replace("Adam", 90, 10);
* getOrDefault()      --> scoreMap.getOrDefault("Ad", 60);
*/

