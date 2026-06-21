import java.util.ArrayList;
import java.util.List;

public class Demo10 {
    // “Consumer Super” → ? super T
    public static void main(String[] args) {
        List<? super Animal> list = new ArrayList<>();
        // “This list can accept Animal or anything above Animal.”
        
        // this refers
        // List<Animal>
        // List<Object>
        

        // so can add any animal and its all the subtypes
        // writing is allowed 

        // lets i have put cat dog ... -> how to read this

        // Animal a = list.get(0); //  not allowed



        // for(Object o:animals){
        //     if(o instanceof Dog){
        //         Dog d = (Dog)o;
        //     }
        //     else if(o instanceof Cat){

        //     }
        // }
    }
}
