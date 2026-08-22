public class DebugDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int result = add(a, b);

        System.out.println("Result = " + result);
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}