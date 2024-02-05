package arraylisttest;

import static org.junit.Assert.*;

import arraylist.AverageGpa;
import arraylist.Student;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class AverageGpaTest {

    private AverageGpa averageGpa;

    @BeforeEach
    void init() {
        averageGpa = new AverageGpa();
    }

    @Test
    public void testRemoveStudentsBelowAverage() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Jane", "Smith", 2.8));
        studentList.add(new Student("Bob", "Johnson", 3.9));
        studentList.add(new Student("Alice", "Williams", 2.5));

        // Expected result after removal
        ArrayList<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student("John", "Doe", 3.5));
        expectedList.add(new Student("Bob", "Johnson", 3.9));

        averageGpa.removeStudentsBelowAverage(studentList);

        // Compare expected list with actual list
        assertEquals(expectedList.size(), studentList.size());
        for (int i = 0; i < expectedList.size(); i++) {
            assertEquals(expectedList.get(i).toString(), studentList.get(i).toString());
        }
    }

    @Test
    public void testRemoveStudentsBelowAverageWithEmptyList() {
        ArrayList<Student> studentList = new ArrayList<>();

        // Empty list, nothing to remove
        averageGpa.removeStudentsBelowAverage(studentList);

        // The list should remain empty
        assertTrue(studentList.isEmpty());
    }
}