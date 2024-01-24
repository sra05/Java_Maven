package loopsandconditions;

public class Reverse {
    public static void main(String[] args) {
        int number = 12345;
        int rNumber = reverseDigits(number);
        System.out.println("Reversed number: " + rNumber);
    }

    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
}
}
