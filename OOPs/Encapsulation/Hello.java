public class Hello {
    public static void main(String[] args) {
        Animal a = new Dog();
        
    }
}
class Animal {
    private String name;

}

class Dog extends Animal {
    void bark(){
        name = "Dog";
        System.out.println("Barking the Dog");
    }
}
