package ImmutableClasses;


import java.util.*;

final class Student {

    private final String name;
    private final List<String> subjects;

    Student(String name, List<String> subjects) {
        this.name = name;
        this.subjects = new ArrayList<>(subjects); 
    }

    String getName() {
        return name;
    }

    List<String> getSubjects() {
        return Collections.unmodifiableList(subjects); 
    }
}

public class Demo3 {
    
}
