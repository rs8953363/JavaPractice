public class SmallestIndexOfTheLargestElement {

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        } /*from  w w w  .j av a2 s  . com*/

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        double max = array[0];
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
        }

        System.out.println(max+" @ "+ indexOfMax);
    }
    }

