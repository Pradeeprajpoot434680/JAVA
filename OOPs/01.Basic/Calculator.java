public class Calculator {
    static int add(int a,int b){
        return a+b;
    }

    static int sub(int a,int b){
        return a-b;
    }

    
    public static void main(String arg[]){
        Calculator c = new Calculator();
        c.add(1,2);
        c.sub(1, 0);
    }
}
