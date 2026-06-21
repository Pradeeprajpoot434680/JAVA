class Box<T> {
    private T value;
    Box(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}

class Pair<T,U> {
     T first;
     U second;

    Pair(T first,U second){
        this.first = first;
        this.second = second;
    }
}


public class Demo2 {
    public static void main(String[] args) {
        // Box<String> b1 = new Box<>("Pradeep");
        // Box<Integer> i1 = new Box<>(10);
        // Box b2 = new Box("hello");// by default it takes Object as generics

        // String s = b1.getValue();
        // Integer s2 = i1.getValue();
        // System.out.println(i1.getValue() + 20);



        Pair<Integer,String> p = new Pair(10,"hello");

        System.out.println(p.first + "   " + p.second);
    }
}
