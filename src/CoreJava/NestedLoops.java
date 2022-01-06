package CoreJava;

    public class NestedLoops {
        public static void main(String[] args) {
            int k = 1;

            int i;
            int a;
            for(i = 0; i < 4; ++i) {
                System.out.println("outer loop started");
                for(a = 1; a <= 4 - i; ++a) {
                    System.out.print(k);
                    System.out.print("\t");
                    ++k;
                }
                System.out.println("");
            }

            System.out.println("Example on pyramid Triangle");
            i = 1;

            for(a = 1; a < 5; ++a) {
                for(int j = 1; j <= a; ++j) {
                    System.out.print(j);
                    System.out.print("\t");
                    ++i;
                }
                System.out.println("");
            }

        }
    }


