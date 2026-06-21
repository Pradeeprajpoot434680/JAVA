import java.util.ArrayList;
import java.util.List;

class Animal {
    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animal {
    @Override
    void eat(){
        System.out.println("Dog is eating");
    }

    void bark(){
        System.out.println("Dog is barking");
    }
}


class Cat extends Animal {
    @Override
    void eat(){
        System.out.println("Cat is eating");
    }

    void miomioLadle(){
        System.out.println("Cat is Mio Mio");
    }
}

public class Demo7 {
    public static void main(String[] args) {
        List<Animal> a = new ArrayList<>();
        List<Dog> d = new ArrayList<>();

        // a = d;

        // Animal a = new Dog(); // OK

        // List<Animal> animals = new ArrayList<Dog>(); //  NOT allowed


        // why
        // imagine this is allowed
        
        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs;   // (imagine this was allowed)

        // animals.add(new Cat());        // valid for List<Animal>


        // // But now your List<Dog> contains a Cat → BOOM at runtime.

        // for(Dog d :animals){
        //     d.bark();// if cat comes - runtime exception
        // }

        
        // Invariance of generics => List<Dog> !extends List<Animal>


        // BUt
        Dog[] dogs = new Dog[5];
        Animal[] animals = dogs; // allowed

        // for(Dog d :animals){
        //     d.bark();// if cat comes - runtime exception
        // }
        
    }
}

