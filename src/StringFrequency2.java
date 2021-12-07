public class StringFrequency2 {
        public static void main(String[] args) {

            System.out.println("returnFrequncy(\"school\") = " + returnFrequncy("school"));
        }
        public static String returnFrequncy(String words) {

            String frequency = "";
            for (int i = 0; i < words.length(); i++) {
                int count = 0;
                for (int j = 0; j < words.length(); j++) {
                    if (words.charAt(i) == words.charAt(j)) {
                        count++;
                    }
                }
                if (!frequency.contains(""+ words.charAt(i))) {
                    frequency += count +"" + words.charAt(i);
                    //freequency +=count +""+ words.charAt(i) ;
                }
            }
            return frequency;
        }
    }

