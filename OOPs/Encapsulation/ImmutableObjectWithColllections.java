import java.util.ArrayList;
import java.util.List;

// final class Employee {

//     private final List<String> skills;

//     Employee(List<String> skills) {
//         this.skills = skills;
//     }

//     public List<String> getSkills() {
//         return skills;
//     }
// }
public class ImmutableObjectWithColllections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");

        Employee e = new Employee(list);

        e.getSkills().add("dnsd");

        System.out.println(list);
    }
}

/***********************************************************/

// Defencive copy

final class Employee {

    private final List<String> skills;

    Employee(List<String> skills) {
        this.skills = new ArrayList<>(skills);
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }
}