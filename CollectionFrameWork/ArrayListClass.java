import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListClass {
    public static void main(String[] args) {
        // immutable collection
        // List<Integer> list = List.of(1,2,3,4,5);
        
        // System.out.println(list);

        // List<Integer> list = Arrays.asList(1,2,3,4,5);
        // list.add(12);
        // System.out.println(list);

        Set<Integer> unique = new LinkedHashSet<>(List.of(1,2,3,2,2,3,4,2,1,1,3,12,2));

        for(Integer i: unique){
            System.out.println(i);
        }

        //  List<Integer> numbers =
        //         Arrays.asList(10, 50, 20, 80, 50, 30);



        //         Integer secondLargest = numbers.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElseThrow(()->{
        //             new IllegalArgumentException("No second-largest element");
        //         });
        //         System.out.println(secondLargest);


        Parent p = new Child();
        p.print();
    }
    
}

class Parent {
    static void print(){
        System.out.println("Hello Parent");
    }
}

class Child extends Parent {
    static void print(){
        System.out.println("Hello Child");
    }
}