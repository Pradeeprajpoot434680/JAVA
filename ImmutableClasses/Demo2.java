// package ImmutableClasses;

import java.util.ArrayList;
import java.util.List;


import java.util.*;

final class Student {

    private final String name;
    private final List<String> subjects;

    Student(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects; 
    }

    String getName() {
        return name;
    }

    List<String> getSubjects() {
        return subjects; 
    }
}



// public class Demo2 {
//     public static void main(String[] args) {

//         List<String> list = new ArrayList<>();
//         list.add("Math");
//         list.add("Science");

//         Student s = new Student("Aman", list);

//         System.out.println(s.getSubjects()); // [Math, Science]

//         list.add("English");

//         System.out.println(s.getSubjects()); // [Math, Science, English]
//     }
// }


public class Demo2 {
    public static void main(String[] args) {

        
        List<String>list =new ArrayList<>();
        list.add("Hindi");
        list.add("Engilsh");
       Student s = new Student("Prady",list );

       System.out.println(s.getSubjects());
      
       list.add("Illigal");//external modification
       System.out.println(s.getSubjects().add("Math"));
       System.out.println(s.getSubjects());
    }
}