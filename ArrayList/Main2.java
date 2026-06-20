import java.util.ArrayList;
import java.util.List;

class Subject {
    String name;
    Subject(String name){
        this.name = name;
    }
}

class StudentSubejcts {
    Subject s;
    int marks;
    StudentSubejcts(Subject s,int marks){
        this.s = s;
        this.marks = marks;
    }
}

class Student {
    String name;

    List<StudentSubejcts> allSubjects = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    void assignSubjects(List<StudentSubejcts> l){
        this.allSubjects = l;
    }

    int calculateTotalMarks() {
    return allSubjects.stream()
            .mapToInt(ss -> ss.marks)
            .sum();
    }


}
public class Main2 {
    public static void main(String args[]){
        Subject s1 = new Subject("Hindi");
        Subject s2 = new Subject("English");
        Subject s3 = new Subject("Math");
        Subject s4 = new Subject("Physics");
        Subject s5 = new Subject("Chemistry");

        

        // Student st1 = new Student("Pradeep");

        // StudentSubejcts sub1 = new StudentSubejcts(s1, 50);
        // StudentSubejcts sub2 = new StudentSubejcts(s2, 30);
        // StudentSubejcts sub3 = new StudentSubejcts(s3, 40);
        // StudentSubejcts sub4 = new StudentSubejcts(s4, 20);
        // StudentSubejcts sub5 = new StudentSubejcts(s5, 60);

        // st1.assignSubjects(List.of(sub1,sub2,sub3,sub4,sub5));


        // Student st2 = new Student("Pradeep");

        // StudentSubejcts sub11 = new StudentSubejcts(s1, 50);
        // StudentSubejcts sub22 = new StudentSubejcts(s2, 30);
        // StudentSubejcts sub33 = new StudentSubejcts(s3, 40);
        // StudentSubejcts sub44 = new StudentSubejcts(s4, 20);
        // StudentSubejcts sub55 = new StudentSubejcts(s5, 60);

        // st2.assignSubjects(List.of(sub11,sub22,sub33,sub44,sub55));

       
        
    }
}
