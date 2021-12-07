public class AfterSplit {
    public static void main(String[] args) {
        System.out.println(afterSplit("track123king"));
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

        return str2;
    }

    /*  2nd solution
                          i i+1
                Input: "DC 501 GCCCA 098911"
                         i i+1

               i is letter and i+1 is digit
                    ==> add space after i
               i is digit and i+1 is letter
                    ==> add space after i
    */

}
