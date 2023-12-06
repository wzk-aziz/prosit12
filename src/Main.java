import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        // Create some students
        Etudiant etudiant1 = new Etudiant(1, "John", 20);
        Etudiant etudiant2 = new Etudiant(2, "Jane", 22);
        Etudiant etudiant3 = new Etudiant(3, "Doe", 21);

        // Add students to a list
        List<Etudiant> students = Arrays.asList(etudiant1, etudiant2, etudiant3);

        // Display all students
        sm.displayStudents(students, System.out::println);

        // Display students with age > 20
        sm.displayStudentsByFilter(students, e -> e.getAge() > 20, System.out::println);

        // Return students names
        String names = sm.returnStudentsNames(students, Etudiant::getNom);
        System.out.println(names);

        // Sort students by id
        List<Etudiant> sortedStudents = sm.sortStudentsById(students, Comparator.comparing(Etudiant::getId));
        sortedStudents.forEach(System.out::println);

        // Convert list to stream
        sm.convertToStream(students).forEach(System.out::println);
    }
}
