import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Subject {
    String name;

    Subject(String name) {
        this.name = name;
    }
}

class StudentSubject {
    Subject subject;
    int marks;

    StudentSubject(Subject subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }
}

class Student {
    String name;
    List<StudentSubject> allSubjects = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void assignSubjects(List<StudentSubject> subjects) {
        this.allSubjects = subjects;
    }

    int calculateTotalMarks() {
        return allSubjects.stream()
                .mapToInt(ss -> ss.marks)
                .sum();
    }
}

public class Main3 {

    public static void main(String[] args) {

        Subject hindi = new Subject("Hindi");
        Subject english = new Subject("English");
        Subject math = new Subject("Math");
        Subject physics = new Subject("Physics");
        Subject chemistry = new Subject("Chemistry");

        List<Subject> subjects = List.of(
                hindi, english, math, physics, chemistry);

        List<Student> students = new ArrayList<>();

        Random random = new Random();

        for (int i = 1; i <= 20; i++) {

            Student student = new Student("Student-" + i);

            List<StudentSubject> studentSubjects = new ArrayList<>();

            for (Subject subject : subjects) {
                int marks = 30 + random.nextInt(71); // 30-100

                studentSubjects.add(
                        new StudentSubject(subject, marks));
            }

            student.assignSubjects(studentSubjects);
            students.add(student);
        }

        // for (Student student : students) {
        //     System.out.println(
        //             student.name +
        //             " Total Marks = " +
        //             student.calculateTotalMarks());
        // }


        // sort the students according to marks

        //Collections.sort(students,(s1,s2)-> s1.calculateTotalMarks() - s2.calculateTotalMarks());

        // for (Student student : students) {
        //     System.out.println(
        //             student.name +
        //             " Total Marks = " +
        //             student.calculateTotalMarks());
        // }


        // assign rankning

        // Collections.sort(students,(s2,s1)-> s1.calculateTotalMarks() - s2.calculateTotalMarks());

        int rank = 1;
        // for (Student student : students) {
        //     System.out.println(
        //             student.name +
        //             " Total Marks = " +
        //             student.calculateTotalMarks() + "  Rank of Studnt:" + rank);

        //             rank++;
        // }


        // find Topper of the class 
        int index = 0;
        int maxMarks = 0;
        int p = 0;
        for (Student student : students) {
            int x = student.calculateTotalMarks();
            if(x > maxMarks){
                maxMarks = x;
                index = p;
            }
            p++;
        }

        Student sTopper = students.get(index);
        System.out.println("Topper of the Clas is:"+ sTopper.name + " -> Marks : "+maxMarks);
    }
}