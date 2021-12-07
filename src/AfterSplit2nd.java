import java.util.Arrays;

public class AfterSplit2nd {
    public static void main(String[] args) {
       /*                i i+1
                Input: "DC 501 GCCCA 098911"
                         i i+1
               i is letter and i+1 is digit
                    ==> add space after i
               i is digit and i+1 is letter
                    ==> add space after i
    */
        System.out.println(afterSplit("DC 501 GCCCA 098911"));
    }
        public static String afterSplit(String str) {
            String str2 = "";
            for(int i = 0; i < str.length(); i++) {
                str2 += ""+str.charAt(i);

                if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {
                    if(Character.isDigit(str.charAt(i+1)) ) {
                        str2 +=" ";
                    }
                }

                if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {
                    if(Character.isAlphabetic(str.charAt(i+1))) {
                        str2 +=" ";
                    }
                }
            }


            //Input: "DC 501 GCCCA 098911"
            String expected = "";
            String[] arr = str2.split(" ");
            for (String s : arr) {
                char[] charEachWord = s.toCharArray();
                Arrays.sort(charEachWord);
                for (char c : charEachWord) {
                    expected += "" + c;
                }
            }


            return expected;

        }
    }