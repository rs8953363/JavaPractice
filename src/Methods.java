public class Methods {
    public static void main(String[] args) {

        //You need an abject to call a method. You need to use the class name to create the object
        Methods d = new Methods();
        System.out.println(d);//return type void oldugu icin bu printly consel'a sadece Methods@2503dbd3 yazdirir
        //System.out.println(d.getData()); This gives compiler error as return type is void
        System.out.println(d.getData2());
        System.out.println();

        Methods2 d1 = new Methods2();
        d1.getUserData();
        System.out.println(d1.getUserData());
        //You cannot create a method inside of the main block
    }


    public void getData(){ //public means this method can be accessable not only from this class but all other classes
        // as well. Void mean there is no return type. You cannot write return in the method
        System.out.println("Here is your data");
    }

    public String getData2(){ //Let's change the return type this time.
        System.out.println("Here is your data");
        return "Hello Java";//Writes the out to concele like println
    }
}
