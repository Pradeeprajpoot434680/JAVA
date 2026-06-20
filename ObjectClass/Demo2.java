package ObjectClass;

class Student {
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
         if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student other = (Student) obj;

        return this.name == other.name && this.age == other.age;
    } 

}


public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("Pradeep", 20);
        Student s2 = new Student("Pradeep", 20);

        System.out.println(s1 == s2);      // false
        System.out.println(s1.equals(s2)); // true
    }
}
