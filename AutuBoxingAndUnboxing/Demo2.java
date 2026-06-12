public class Demo2 {
    public static void main(String[] args) {
        int x = 10; 
        Integer y = x;// compiler does Integer.valueOf(x) => Autoboxing

        Integer p = Integer.valueOf(20);
        int q = p;
        
        // int q = p.intValue();
    }
}
