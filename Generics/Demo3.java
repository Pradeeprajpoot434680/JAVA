

/*
    if i want to print any datatype so i have to overload too many methods
    one for each datatype
*/

public class Demo3 {

    /*
        Overloaded  Methods
    */
    // public static void print(Integer x){
    //     System.out.println("Value of Int:"+x);
    // }

    // public static void print(String x){
    //     System.out.println("Value of String:"+x);
    // }

    // public static void print(Box x){
    //     System.out.println("Value of Int:"+x);
    // }


    public static <T> void print(T value) {
        System.out.println(value);
    }

    // Multiple type parameters
    
     public static <T, U> void display(T first, U second) {
        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String[] args) {

        print("Hello");   // T becomes String
        print(10);        // T becomes Integer
        print(5.5);       // T becomes Double
    }
}
