import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;
    int rollNo;

    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}


class MyAgeComp implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age != s2.age) {
            return Integer.compare(s1.age, s2.age);
        } else {
            return Integer.compare(s1.rollNo, s2.rollNo);
        }
    }
}

class MyRollComp implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.rollNo != s2.rollNo){
            return Integer.compare(s1.rollNo, s2.rollNo);
        }else{
            return Integer.compare(s1.age, s2.age);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        // 10 students unsorted order
        List<Student> students = new ArrayList<>(10);

        // Adding 10 students
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

        // Comparator<Student> comp = new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2) {
        //         if (s1.age != s2.age) {
        //             return Integer.compare(s1.age, s2.age);
        //         } else {
        //             return Integer.compare(s1.rollNo, s2.rollNo);
        //         }
        //     }
        // };

        Collections.sort(students, new MyAgeComp());

        for (Student s : students) {
            System.out.println(s.name + " " + s.age + " " + s.rollNo);
        }
    }
}


/*
    problems in this solution

    when i am sorting this then i am getting the output based on age and then roll number
    but i also want to sort based on name => answer is expected

    but i have to write the extracode but i  require only the logic of my function 
    
    if(s1.rollNo != s2.rollNo){
        return Integer.compare(s1.rollNo, s2.rollNo);
    }else{
        return Integer.compare(s1.age, s2.age);
    }

    i have to write the class method then i can do that


    Solution is functional Interfaces
    

*/