public class Student {

    String name= "Sravani";
    public String getName() {
        return name;
    }
    public static void main(String[] args){

        Student studentName = new Student();
        System.out.println(studentName.getName());
    }
}
