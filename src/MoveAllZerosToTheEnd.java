import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {

        //4- write a program that can move all the zeros to the end of the List of integers
        //5- Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
        List<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(3,5,0,7,6,4,0,0,33));
        //removeZerosToEnd(lst);

        int[] arr = new int[lst.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lst.get(i);
        }
        System.out.println(lst);
        removeZerosToEnd(arr);
    }

    public static void removeZerosToEnd(int[] arr) {

        int[] arr2 = new int[arr.length];
        for(int i=0, x=0;  i<arr.length; i++) {
            if(arr[i]>0) {
                arr2[x] = arr[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    //2nd Solution:
//    import java.util.Arrays;
//
//    public class MoveZeroToTheEnd {
//        public static void main(String[] args) {
//            int[] num1={0,2,0,6,7,0,9,0};
//            System.out.println("allZeroMoveToTheEnd(num1) = " + Arrays.toString(allZeroMoveToTheEnd(num1) ));
//        }
//        public static int[] allZeroMoveToTheEnd(int[] num1) {
//            int[] num2 = new int[num1.length];
//            int countZero = 0;
//            for (int i = 0; i < num1.length; i++) {
//                if (num1[i] == 0) {
//                    countZero++;
//
//                }
//                num2[countZero-1]=num1[i];
//
//            }
//            return num2;
//        }
//    }


    //3rd solution
//    public static Object[] zero(int[] a ){
//        List<Integer> list = Arrays.stream(a).filter(p-> p==0).boxed().collect(Collectors.toList());
//        list.addAll(Arrays.stream(a).filter(p-> p!=0).boxed().collect(Collectors.toList()));
//        return list.toArray();
//    }
//    public static Object[] zero1(int[] a ){
//        List<Integer> list = Arrays.stream(a).filter(p-> p!=0).boxed().collect(Collectors.toList());
//        list.addAll(Arrays.stream(a).filter(p-> p>=0).boxed().collect(Collectors.toList()));
//        return list.toArray();
//    }
//    public static void changeValue(Object[] obj){
//        String[] str = (String[]) obj;
//        str[0] = "hello";
//
//    }
//
//    public static void main(String[] args) {
//        String[] strings = {"bye"};
//        changeValue(strings);
//        System.out.println("strings[0] = " + strings[0]);
//        // door
//        // door  , do , or
//    }

    //4th solution
    //1, 0, 0, 0, 5, 6, 7, 9, 0   => original size
    // 1, 5, 6, 7, 9,             => new size

    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeIf(p-> p == 0);
        int newSize = list.size();

        for (int i = originalSize - newSize; i < originalSize; i++) {
            list.add(0);
        }
        return list;
    }

}
