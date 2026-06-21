import java.util.ArrayList;
import java.util.List;

public class Demo9 {
    static void fun(List<? extends Animal> list){
        Animal a = list.get(0);
        // now i can call all the funcrions of the Animal class

        // list.add(new Dog()); => now allowed

        // Why not allowed
        // List<? extends Animal> list; => lists of Dogs
        // list.add(new Cat());
        // list.bark()=> Runtime error


        // or list.add(new Animal()) => DOg reference can not keep the Animal reference


        // Reading is allowed nut writing is not allowed
    }


    public static void main(String[] args) {
        // “Producer Extends” → ? extends T

        List<? extends Animal> list = new ArrayList<Dog>();
        
        // Meaning:
        // “I don’t know the exact subtype, but it’s some kind of Animal.”

        // this refers
        // List<Animal>
        // List<Dog>
        // List<Cat>

    }
}
