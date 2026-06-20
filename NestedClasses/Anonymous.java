/*
ClassName obj = new ClassName() {
     override methods or add new behavior
};

InterfaceName obj = new InterfaceName() {
     implement methods
};
*/

class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override

    void sound(){
        System.out.println("Dog barks");
    }
}

interface Man {
    void display(String name);
}



public class Anonymous {
    public static void main(String[] args) {
        Animal a = new Animal(){
            @Override
            void sound(){
                System.out.println("Cat sound");
            }
        };

        a.sound();

        Man m1 = new Man() {
            @Override
            public void display(String name) {
                System.out.println("My Name is:"+name);
            }
        };

        m1.display("Pradeep");
    }
}

// new Animal() implements Runnable { }  // ❌ invalid

// new Animal() implements Runnable, Serializable { } // ❌ invalid