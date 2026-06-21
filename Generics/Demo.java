
// i want to store anything in this box
// class Box {
//     int value;
//     public Box(int value){
//         this.value = value;
//     }
// }

class Box {
    Object value;
    public Box(Object value){
        this.value = value;
    }
}


public class Demo {
    public static void main(String[] args) {
        Box b1 = new Box("String");
        System.out.println(b1.value);

        Box b2 = new Box(12);


        // i want to process box type
        String s =(String) b1.value; // type casing
        String s2 = (String) b2.value; // no error this gives run time error

        // b1.value.length(); X
        // we can call only the Object methods at the box'value type


        // System.out.println(b2.value + 3); => it does not know the exact type 



        // Benefits of Generics
        // Move errors:

        // Runtime
        // ↓

        // Compile Time
        
    }
}