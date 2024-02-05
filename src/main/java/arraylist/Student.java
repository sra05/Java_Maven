package arraylist;

public class Student {
    public String firstName;
    public String lastName;
    public double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{firstName='" + firstName + "', lastName='" + lastName + "', gpa=" + gpa + '}';
    }
}
