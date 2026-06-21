import java.util.ArrayList;
import java.util.List;

class Animal { }

class Dog extends Animal { }

class Cat extends Animal { }



public class Demo8 {

    static void printAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    static void seeDemo(List<?> list){// we can anot add any element in this
                        // beacuse its type os known this i sonly read only
                        
        for(Object object:list){
            System.out.println(object.getClass().getName());
        }

    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        // Demo8.printAnimals(dogs); // Compile Error


        // List<?> list = new ArrayList<>();
        // list.add(new Animal());

        // Here List<?> means a list of an unknown type (wildcard). Because the type is unknown,
        // Java prevents you from adding anything except null.

        // List<String> list = new ArrayList<>();
        // List<?> ref = list;
        // list.add(null);
        // What is allowed?
        // list.add(null); //  allowed

        // Because null fits any reference type.



        // If you want flexibility with inheritance

        List<? super Animal> list = new ArrayList<>();
        list.add(new Animal()); //  allowed
        list.add(new Dog());
        list.add(new Cat());



        


    }
}
