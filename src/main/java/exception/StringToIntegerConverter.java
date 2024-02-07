package exception;
public class StringToIntegerConverter {

    // Method to convert a string to an integer and print the result or handle exception
    public static void convertAndPrint(String input) {
        try {
            // Try to convert the input string to an integer
            int result = convertStringToInt(input);
            // If successful, print the converted integer
            System.out.println("String '" + input + "' converted to integer: " + result);
        } catch (NumberFormatException e) {
            // If parsing fails due to an invalid input, catch the exception
            // Print the exception message along with the input string causing the error
            System.out.println("Exception occurred for input '" + input + "': " + e.getMessage());
        }
    }

    // Method to convert a string to an integer
    // Throws NumberFormatException if the input string cannot be parsed as an integer
    public static int convertStringToInt(String input) throws NumberFormatException {
        // Use Integer.parseInt() method to convert the string to an integer
        return Integer.parseInt(input);
    }
}