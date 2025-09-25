

public class SwapTwoVar {
    public void f(int a,int b){
        int x = a;
        a = b;
        b=x;
    }
    public static void main(String[] args) {
        SwapTwoVar obj = new SwapTwoVar();
        int a=20;
        int b = 40;
        System.out.println(a + " " + b);
        obj.f(a,b);
        System.out.println(a + " " + b);
    }
}
