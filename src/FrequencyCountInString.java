public class FrequencyCountInString {
    public static void main(String[] args) {
        System.out.println("returnFrequency of school= " + returnFrequency("school"));

    }
    public static String returnFrequency(String words) {
        int count = 0;
        String frequency = "";
        for (int i = 0; i < words.length(); i++) {
            count = 0;
            for (int j = 0; j < words.length(); j++) {
                if (words.charAt(i) == words.charAt(j)) {
                    count++;
                }

            }
            if (!frequency.contains("" + words.charAt(i)))
                frequency += count + "" + words.charAt(i);
        }

        return frequency;
    }
}
