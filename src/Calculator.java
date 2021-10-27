public class Calculator {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 10;

        System.out.println(add(num1, num2));
        System.out.println(subtract(num1, num2));
        System.out.println(multiply(num1, num2));
        System.out.println(divide(num1, num2));
    }
        public static double add ( double num1, double num2){
            return num1 + num2;
        }
        public static double subtract( double num1, double num2){
            return num1 - num2;
        }
        public static double multiply ( double num1, double num2){
            return num1 * num2;
        }
        public static double divide ( double num1, double num2){
        return num1 / num2;
    }
    }

