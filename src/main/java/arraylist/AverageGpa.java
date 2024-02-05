package arraylist;
import java.util.ArrayList;

public class AverageGpa {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Jane", "Smith", 2.8));
        studentList.add(new Student("Bob", "Johnson", 3.9));
        studentList.add(new Student("Alice", "Williams", 2.5));

        // Display the ArrayList before removal
        System.out.println("Students before removal:");
        displayStudents(studentList);

        // Remove students with GPA less than the average GPA
        removeStudentsBelowAverage(studentList);

        // Display the ArrayList after removal
        System.out.println("\nStudents after removal:");
        displayStudents(studentList);
    }

    // Function to remove students with GPA less than the average GPA
    public static void removeStudentsBelowAverage(ArrayList<Student> students) {
        // Calculate the average GPA
        double totalGpa = 0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / students.size();

        // Remove students with GPA less than the average GPA
        students.removeIf(student -> student.getGpa() < averageGpa);
    }

    // Function to display the list of students
    public static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

