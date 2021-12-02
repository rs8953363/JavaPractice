public class OCAJavaIdentifiers {
    /*
*   1. Which of the following are valid Java identifiers? (Choose all that apply)
        A. A$B - valid
        B. _helloWorld - valid
        C. true - invalid - reserved keyword
        D. java.lang - invalid
        E. Public - valid - case sensitive - public
        F. 1980_s - invalid
*/
        public static void main(String[] args) {
            String Public = "Ali";
            int _helloWorld = 5;
            String java = "lsjdf";
        }
        /*
        10. Which of the following are legal entry point methods that can be run from the command
        line? (Choose all that apply)
        A. private static void main(String[] args) - invalid - private
        B. public static final main(String[] args)
        C. public void main(String[] args)
        D. public static void test(String[] args)
        E. public static void main(String[] args)
        F. public static main(String[] args)
        G. None of the above.
         */

  /*9. /*
    Which of the following legally fill in the blank so you can run the main() method from the
    command line? (Choose all that apply)
    public static void main(String[] )
    A. String[] _names      - valid
    B. String[] 123         - invalid
    C. String abc[]         - valid
    D. String _Names[]      - valid
    E. String... $n         - valid
    F. String names -         - invalid
    G. None of the above.
* */


    /*
    15. Which of the following lines of code compile? (Choose all that apply)
        int i1 = 1_234; - valid
        double d1 = 1_234_.0; - invalid
        double d2 = 1_234._0; - invalid
        double d3 = 1_234.0_;- invalid
        double d4 = 1_234.0; valid
        None of the above.
     */
        short numPets = 5;
//      float numGrains = 5.6;
//      numPets.length();

    /*3. Which of the following are true? (Choose all that apply)
    4: short numPets = 5;
    5: int numGrains = 5.6;
    6: String name = "Scruffy";
    7: numPets.length();
    8: numGrains.length();
    9: name.length();
    *
    *Answer: B
    A. Line 4 generates a compiler error.
    B. Line 5 generates a compiler error. It should be int not decimal
    C. Line 6 generates a compiler error.
    D. Line 7 generates a compiler error.
    E. Line 8 generates a compiler error.
    F. Line 9 generates a compiler error.
    G. The code compiles as is.
     */



    /* 4. class level scope - instance variable
/*   scope
        * Given the following class, which of the following is true? (Choose all that apply)
        1: public class Snake {
        2:  String result = "done"
        3: public void shed(boolean time) {
        4:
        5: if (time) {
        6:
        7: }
        8: System.out.println(result);
        9:
        10: }
        11: }
        *
        A. If String result = "done"; is inserted on line 2, the code will compile.
        B. If String result = "done"; is inserted on line 4, the code will compile.
        C. If String result = "done"; is inserted on line 6, the code will compile.
        D. If String result = "done"; is inserted on line 9, the code will compile.
        E. None of the above changes will make the code compile.
/*
* A is correct. Adding the variable at line 2 makes result an instance variable. Since instance variables are in
scope for the entire life of the object.
B is correct because adding the variable at line 4 makes result a local variable with a scope of the whole method.
C is incorrect. Adding the variable at line 6 makes result a local variable with a scope of lines 6-7. Since it
is out of scope on line 8, the println does not compile.
Adding the variable at line 9 makes result a local variable with a scope of lines 9 and 10.
D is incorrect. Since line 8 is before the declaration, it does not compile.
E is incorrect since A and B make code to compile.
     */
    }



