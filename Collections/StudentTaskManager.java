import java.util.*;

public class StudentTaskManager {

    Map<Integer, String> students = new HashMap<>();
    Set<String> emails = new HashSet<>();
    List<String> courses = new ArrayList<>();
    Queue<String> tasks = new LinkedList<>();
    Deque<String> recentActions = new ArrayDeque<>();

    public void addStudent(int roll, String name, String email) {
        if (emails.contains(email)) {
            System.out.println("Email already registered!");
            return;
        }
        students.put(roll, name);
        emails.add(email);
        recentActions.addFirst("Added student: " + name);
        System.out.println("Student added successfully.");
    }

    public void registerCourse(String course) {
        courses.add(course);
        recentActions.addFirst("Registered course: " + course);
    }

    public void addTask(String task) {
        tasks.add(task);
        recentActions.addFirst("Added task: " + task);
    }

    public void processTask() {
        String t = tasks.poll();
        if (t == null) System.out.println("No tasks pending.");
        else System.out.println("Processing: " + t);
    }

    public void showRecentActions() {
        System.out.println("Recent actions: " + recentActions);
    }

    public void showSummary() {
        System.out.println("\n--- Dashboard ---");
        System.out.println("Students: " + students);
        System.out.println("Emails: " + emails);
        System.out.println("Courses: " + courses);
        System.out.println("Pending Tasks: " + tasks);
        System.out.println("-----------------\n");
    }

    public static void main(String[] args) {
        StudentTaskManager app = new StudentTaskManager();

        app.addStudent(101, "Ravi", "ravi@gmail.com");
        app.addStudent(102, "Nisha", "nisha@gmail.com");

        app.registerCourse("Java");
        app.registerCourse("DBMS");

        app.addTask("Complete Assignment");
        app.addTask("Submit Project");

        app.processTask(); // FIFO queue

        app.showRecentActions(); // Uses Deque
        app.showSummary();
    }
}
