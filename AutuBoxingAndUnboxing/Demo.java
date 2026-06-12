import java.util.ArrayList;
import java.util.List;

class Demo {
    public static void main(String[] args) {
        // problem in java

        List<Integer> l = new ArrayList<>();
        l.add(10);

        // ArrayList<int> list = new ArrayList<>();

        //wrapper classes of primitives -> int -> Integer

        int num = 10;
        Integer num2 = Integer.valueOf(10);
        
        // why wrapper classes exist
        // collection works classes
        // // object Methods -> x.toString()
        // Integer p  = num;
        // System.out.println(p.toString());


        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a==b);// it will create the new obejcts


        Integer c= Integer.valueOf(200); // it caches the values -128 to 127
        Integer d= Integer.valueOf(200);
        System.out.println(c==d);
        

    }
}