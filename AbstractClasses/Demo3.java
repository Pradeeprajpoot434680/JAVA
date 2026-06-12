public class Demo3 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.run();
    }
}


abstract class Animal {
    private String name;
    void eat(){
        System.out.println("Sleeping");
    }
    abstract void sound();

    Animal(String name){
        this.name = name;
        System.out.println("Animal constructor");
    }

}

class Dog extends Animal {

    Dog(){
        super("Dog");
    }

    void sound(){

        System.out.println("Bark");

    }


    void run(){

        System.out.println("Running");

    }

}
// Dog()
//  |
//  |
// super()
//  |
//  |
// Animal()
//  |
//  |
// Dog()