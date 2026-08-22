import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    String name;
    int age;
    int rollNo;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + rollNo;
    }
}

public class Demo2 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20, 1));
        students.add(new Student("Bob", 22, 21));
        students.add(new Student("Charlie", 21, 3));
        students.add(new Student("David", 23, 44));
        students.add(new Student("Eva", 20, 5));
        students.add(new Student("Frank", 22, 1));
        students.add(new Student("Grace", 21, 7));
        students.add(new Student("Hannah", 23, 8));
        students.add(new Student("Ivy", 20, 12));
        students.add(new Student("Jack", 22, 10));

        Collections.sort(students, (s1, s2) -> {
            if (s1.age != s2.age) {
                return Integer.compare(s1.age, s2.age);
            }
            return Integer.compare(s1.rollNo, s2.rollNo);
        });

        System.out.println(students);
    }
}