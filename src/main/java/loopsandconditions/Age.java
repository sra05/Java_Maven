package loopsandconditions;

import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the person's age: ");
        int personAge = scanner.nextInt();
        classifyAge(personAge);
    }

    private static void classifyAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        }
        else {
            System.out.println("Adult");
        }
    }
}

