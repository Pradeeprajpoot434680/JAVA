
import java.util.ArrayList;
import java.util.List;



public  class ImmutableObject {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");

        Employee e = new Employee(list);

        list.add("Python");
    }
}

final class Person {
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}


final class Employee {

    private final List<String> skills;

    Employee(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }
}

// final -> can not inherate
// private -> can not access outside the class
// getters only