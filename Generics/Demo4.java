class Utility {
    static <T>  void print(T value){
        System.out.println(value);
    }
}

// class Box<T> {
//     T value;
//     void printDouble(){
//         System.out.println(value.getDouble()); // we can not do that beacuse we does not kniw T
//     }
// }

//The compiler only knows that T is some object. It could be:String,Int

class Box <T extends Number> {
    T value;
    public void printValue(){
        System.out.println(value.doubleValue());
    }
}

// T will always be a Number or one of its subclasses.

public class Demo4 {
    public static void main(String[] args) {
        // Utility.<Integer>print(10);

        Box<Integer> b1 = new Box<>();
        b1.value = 10;
        b1.printValue();

        Box<Double> b2 = new Box<>();
        b2.value = 12.5;
        b2.printValue();

        // Box<String> b3 = new Box<>(); String is not under number class
    }
}
