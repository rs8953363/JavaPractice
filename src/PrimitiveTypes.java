public class PrimitiveTypes {
    public static void main(String[] args) {
        int a = 15;
        boolean isEnabled = true;
        char firstInitial = 'A';
        double salary= 60.500;
        System.out.println();

        int million1=1000000;
        int million2= 1_000_000;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        int number=5;
        int Number=10; //Java is case sensitive (Common error)

        int num = 2147483647 + 1;
        System.out.println("number is: " +number); //overflow (Common error) Overflow olunca code hata vermiyor.

        int x=24;
        byte x; //won't work


    }
}
