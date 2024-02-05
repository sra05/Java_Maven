package maps;

import java.util.HashMap;

public class StudentMap {
    private HashMap<String, StudentDetails> studentMap;

    public StudentMap() {
        studentMap = new HashMap<>();
        initializeMap();
    }

    private void initializeMap() {
        // Creating 8 student objects and putting them into the map
        studentMap.put("John", new StudentDetails("John", "Doe", 3.5));
        studentMap.put("Alice", new StudentDetails("Alice", "Smith", 3.8));
        studentMap.put("Bob", new StudentDetails("Bob", "Johnson", 3.9));
        studentMap.put("Emily", new StudentDetails("Emily", "Williams", 3.7));
        studentMap.put("David", new StudentDetails("David", "Brown", 3.6));
        studentMap.put("Sarah", new StudentDetails("Sarah", "Jones", 3.4));
        studentMap.put("Michael", new StudentDetails("Michael", "Davis", 3.2));
        studentMap.put("Emma", new StudentDetails("Emma", "Wilson", 3.3));
    }

    public StudentDetails getStudent(String firstName) {
        return studentMap.get(firstName);
    }
}