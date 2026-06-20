import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Subject {
    String name;
    int marks;

    Subject(String name,int marks){
        this.name = name;
        this.marks = marks;

    }
}


class Student {
    Integer id; 
    List<Subject> subjects = new ArrayList<>();
    Student(int id){
        this.id = id;
    }
    void addSubject(Subject subject){
        subjects.add(subject);
    }

    int calculateTotalMarks() {
        return subjects.stream()
                    .mapToInt(s -> s.marks)
                    .sum();
    }

    List<Subject> getSubjects(){
        return this.subjects;
    }

   
}
public class Main {
    public static void main(String arg[]){
        int currId=1;
        List<Student> student = new ArrayList<>();
        Student s1 = new Student(currId++);
        Subject sub1 = new Subject("Hindi",70);
        Subject sub2 = new Subject("Eglish",40);
        Subject sub3 = new Subject("Math",60);
        Subject sub4 = new Subject("physics",20);
        Subject sub5 = new Subject("Chemistry",40);
        
        s1.addSubject(sub1);
        s1.addSubject(sub2);
        s1.addSubject(sub3);
        s1.addSubject(sub4);
        s1.addSubject(sub5);


    //    System.out.println(s1.calculateTotalMarks());
        
        List<Subject> allSubjects = s1.getSubjects();
        
        Collections.sort(allSubjects,(s2,s3)-> s2.marks-s3.marks);

        System.out.println("Sorted subjects:");
        for (Subject s : allSubjects) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}