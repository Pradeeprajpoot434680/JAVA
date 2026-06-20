package ObjectClass;

class Student {

    @Override
    public String toString() {
        return "My Overridden toString method";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student other = (Student) obj;

        // Compare fields here
        return true; // replace with actual field comparisons
    }

    @Override
    public int hashCode() {
        return 1; // generate based on the same fields used in equals()
    }
}

class Teacher {

}
public class Demo1 {
    public static void main(String[] args) {
        Student obj = new Student();
        Teacher t = new Teacher();
        System.out.println(obj.equals(obj));
    }
}
