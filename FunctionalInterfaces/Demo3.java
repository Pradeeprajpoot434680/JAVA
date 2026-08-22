@FunctionalInterface
interface MyOperation {
    int operate(int a,int b);
}

class Calculator {
    void calculate(int a,int b,MyOperation myOperation){
        System.out.println(myOperation.operate(a, b));
    }
}



public class Demo3 {
    public static void main(String[] args) {
        // MyOperation add = (a,b) -> a+b;
        // System.out.println(add.operate(2,4));

        // MyOperation sub = (a,b)-> a-b;

        // System.out.println(sub.operate(4,5));


        Calculator c = new Calculator();

        c.calculate(10, 20, (x, y) -> x + y);

        c.calculate(10, 20, (x, y) -> x * y);

        c.calculate(10, 20, (x, y) -> x - y);
    }
}
