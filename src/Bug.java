public class Bug {
    public static void main(String[] args) {

        public boolean ifCharSeqExistsInString ( char[] chars, String s){

            //s ->  e r r s g h -> int j
            //chars -> 'r''s''g' -> int i
            int i = 0;
            for (int j = 0; j < s.length(); j++) {
                if (chars[i] == s.charAt(j)) {
                    i++;
                    if (i == chars.length) {
                        return true;
                    }
                } else {
                    i = 0;
                }
            }
            return false;
        }

        public boolean ifExistCharInString ( char c, String s){

            return false;
        }
    }
}

