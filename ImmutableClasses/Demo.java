package ImmutableClasses;


final class Student {
    private final String name;
    private final int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }

    // abstract void markAttendence();
}

// class CSStudent extends Student {
//     CSStudent(int age,String name){
//         super(name, age);
//     }

//     @Override
//     void markAttendence(){
//         System.out.println(getName() + " is present");
//     }
// }
public class Demo {
    public static void main(String[] args) {
        Student s = new Student("Pradeep", 21);
        
    }
}
