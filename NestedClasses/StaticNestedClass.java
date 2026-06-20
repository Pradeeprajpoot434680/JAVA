
/*
Logical grouping of classes.
*/
class StaticNestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(outer);

        // Outer.setXandY(20,30);
        int ans = inner.calculateArea();
        inner.printZ(outer);
        System.out.println(ans);
        System.out.println(Outer.Inner.p);
    }
}

class Outer {
    static int x,y;
    int z;

    static void setXandY(int x,int y){
        Outer.x = x;
        Outer.y = y;
    }


    static class Inner {
        Outer o;
        static int p=10;
        Inner(Outer o){
            this.o = o;
        }
        int calculateArea(){
            return x*y;
        }

        void printZ(Outer myOuter){
            System.out.println("Value of Z:"+myOuter.z);
        }
    }
}

class Child extends Outer.Inner {
    
    Child(Outer o){
        super(o);
    }
}