public class NestedClass {
    public static void main(String[] args) {
        // Outer o = new Outer();
        // Outer.Inner inner = o.new Inner();
        // inner.greet();

        Car c = new Car("Lamborghini");
        Car.Engine engine = c.new Engine();
        engine.show();

    }
}

// inner class belongs to obejct

class Outer {
    int y=10;
    static int x = 20;

    class Inner {
        void greet(){
            System.out.println("Namaste:"+x);
        }
    }
}

class Car {

    private String model;
    static int x = 10;
    Car(String model){
        this.model = model;
    }

    class Engine {

        void show(){

            System.out.println(Car.this.model);

        }

    }

}