public class TypeCasting {
    public static void main(String[] args) {
          // Java is not a pure OOP language >> because we have primitive types in Java

             int num = 10;
                 double num1 = 20;


                  	// if we know the number we want to convert takes enough space from the memory,
		// then we can do explicit casting.
		num = (int) num1;
		// this is an implicit casting, it happens automatically
		num1 = num;
	}
}