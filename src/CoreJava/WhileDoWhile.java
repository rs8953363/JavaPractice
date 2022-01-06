package CoreJava;

public class WhileDoWhile {
        public static void main(String[] args) {
            for (int i = 10; i > 0; --i) {
                System.out.println(i);
            }

            int j = 20;
            do {
                System.out.println(j);
                ++j;
            } while (j > 30);

            System.out.println("success");
            System.out.println("second step");

            for (int k = 0; k < 10; k += 3) {
                if (k == 9) {
                    System.out.println(" 9 is displayed");
                } else {
                    System.out.println("I did not find");
                }
            }
        }
        }

