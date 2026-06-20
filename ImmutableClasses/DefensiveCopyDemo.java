class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Copy constructor
    public College(College other) {
        this.collegeName = other.collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}

final class Student {
    private final String name;
    private final College college;

    public Student(String name, College college) {
        this.name = name;

        // Defensive copy during construction
        this.college = new College(college);
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        // Defensive copy during access
        return new College(college);
    }
}

public class DefensiveCopyDemo {
    public static void main(String[] args) {

        College c1 = new College("Saraswati Vidya Mandir");

        Student s1 = new Student("Pradeep", c1);

        // Modify original object
        c1.setCollegeName("CURAJ");

        System.out.println(
                s1.getCollege().getCollegeName()
        ); // Saraswati Vidya Mandir

        // Modify returned copy
        College temp = s1.getCollege();
        temp.setCollegeName("IIT Delhi");

        System.out.println(
                s1.getCollege().getCollegeName()
        ); // Saraswati Vidya Mandir
    }
}