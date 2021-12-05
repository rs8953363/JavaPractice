import java.util.ArrayList;

public class ArrayAndArrayList {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) //4
        {
            System.out.println(arr[i]);
        }

        String[] name = {"rahul", "shetty", "selenium"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        for (String s : name) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                System.out.println(arr[i]);
            }else{
                System.out.println(arr[i] + " is not an even number");
            }
        }
        //We use ArrayList to have a dynmaic array. ArrayList is a class in util package
        ArrayList<String> a = new ArrayList<String>();
        a.add("Hello");
        a.add("Java");
        a.add("academy");
        a.remove(2);
        a.get(0);//To extract the value store in index 4
        System.out.println(a.get(1));
        System.out.println();

        //String is an object and literal
        String s = "Python Coding Academy helps you to sharpen your skills";
        String[] splittedString = s.split(" ");
        System.out.println(splittedString.toString());
        System.out.println(splittedString[1]);

        String[] splittedString2 = s.split("helps");
        System.out.println(splittedString2.toString());
        System.out.println(splittedString2[0]);
        System.out.println(splittedString2[1]);
        //If you want to delete the empty space left to the " you to sharpen your skills, use trim.
        System.out.println(splittedString2[1].trim());//it deletes the chareacters on the left and rright of thee first index element
        System.out.println();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+ " ");
        }
        System.out.println();
//IQ: How to write a string in reverse order?
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i)); //make sure you have prrint statement instead of println so your can see them
            // in one line

        }

    }
}



