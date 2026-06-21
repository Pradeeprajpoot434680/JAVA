interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable,Swimmable {
    @Override
    public void fly(){
        System.out.println("Duck is flying");
    }

    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }
}


class Pradeep implements Flyable,Swimmable {
    @Override
    public void fly(){
        System.out.println("Pradeep is flying");
    }

    @Override
    public void swim(){
        System.out.println("Pradeep is swimming");
    }
}

class Fish implements Swimmable {
    @Override
    public void swim(){
        System.out.println("Fish is swimming");
    }
}

// now here can come any class that implemets both
class Both<T extends Swimmable & Flyable> {
    T bio;


    Both(T bio){
        this.bio = bio;
    }

    void checkTheBio(){
        bio.fly();
        bio.swim();
    }

}

public class Demo6 {
    public static void main(String[] args) {
        Duck d = new Duck();
        Swimmable f = new Fish();

        Pradeep p = new Pradeep();

        Both<Pradeep> n = new Both<>(p);
        Both<Duck> m = new Both<>(d);

        //    Both<Fish> n = new Both<>(f); => Error
        n.checkTheBio();
    }
}
