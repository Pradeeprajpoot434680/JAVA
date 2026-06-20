
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

        // we can call only the Object methods at the box'value type

        
    }
}