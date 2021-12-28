import java.util.HashMap;

public class MostFreqWordIn1stNotPresentIn2nd {
    public static void main(String[] args){
        String S1 = "geeks for geeks is best place to learn";
        String S2 = "bad place";
        System.out.println(smallestFreq(S1, S2));
    }
        public static String smallestFreq(String S1, String S2){
            HashMap<String, Integer> banned = new HashMap<>();

            // create map of banned words
            for (int i = 0; i < S2.length(); i++){
                String s = "";
                while (i < S2.length() && S2.charAt(i) != ' ')
                    s += S2.charAt(i++);

                banned.put(s, banned.get(s) == null ? 1 : banned.get(s) + 1);
            }

            HashMap<String, Integer> result = new HashMap<>();
            String ans = "";
            int freq = 0;

            // find smallest and most frequent word
            for (int i = 0; i < S1.length(); i++){
                String s = "";
                while (i < S1.length() && S1.charAt(i) != ' ')
                    s += S1.charAt(i++);

                // check if word is not banned
                if (banned.get(s) == null){
                    result.put(s, result.get(s) == null ? 1 :
                            result.get(s) + 1);
                    if (result.get(s) > freq ||(result.get(s) == freq && s.compareTo(ans) < 0)){
                        ans = s;
                        freq = result.get(s);
                    }
                }
            }
            return ans;
        }
    }
