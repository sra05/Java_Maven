package staticfinal;

public class Customer {
    static int custNumber = 99999999;

    public static int getCustomerNumber() {
        return custNumber;
    }
    public static void main(String[] args) {

        System.out.println(getCustomerNumber());
}
}
