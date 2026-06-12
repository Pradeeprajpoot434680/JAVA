public class Demo4 {
    public static void main(String[] args) {
        A a = new B();
        A.fun();;
    }
}

abstract class A {
    static void fun(){
        System.out.println("Fun functiona");
    }
    final  void run(){

    }
}

class B extends A{

}