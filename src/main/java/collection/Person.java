package collection;

public class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Override equals method to match persons based on ssn
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;
        return ssn.equals(person.ssn);
    }

    // hashCode method should also be overridden when equals is overridden
    @Override
    public int hashCode() {
        return ssn.hashCode();
    }

    // Getter methods for the variables
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // toString method for better representation
    @Override
    public String toString() {
        return "Person{height=" + height + ", weight=" + weight + ", ssn='" + ssn + "', phoneNumber='" + phoneNumber + "'}";
    }

    public static void main(String[] args) {
        // Creating two persons with the same ssn
        Person person1 = new Person(175.0, 70.0, "123-45-6789", "555-1234");
        Person person2 = new Person(180.0, 75.0, "123-45-6789", "555-5678");

        // Testing the equals method
        System.out.println("Person1: " + person1);
        System.out.println("Person2: " + person2);
        System.out.println("Persons are equal: " + person1.equals(person2));
    }
}
