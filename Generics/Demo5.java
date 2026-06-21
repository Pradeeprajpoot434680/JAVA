class Animal {
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal {

}


class Cage<T extends Animal> {
    T animal;
    Cage(T animal){
        this.animal = animal;
    }
    void feed(){
        animal.eat();
    }
}


public class Demo5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Cage<Dog> c = new Cage<Dog>(dog);// exat type not the animlal refernce

        Cage<Dog> c = new Cage<>(dog);
        c.feed();
    }
}
