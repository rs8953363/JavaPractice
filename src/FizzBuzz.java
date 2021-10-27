import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        if (number % 3 == 0 && number % 5 == 0) { // 15 divided by 3 and 5
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("Buzz");
        }
    }
}