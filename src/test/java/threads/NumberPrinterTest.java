package threads;
import threads.NumberPrinter;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



import static org.junit.Assert.assertEquals;

public class NumberPrinterTest {

    @Test
    public void testNumberPrinter() {
        // Set up a new output stream for testing
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the number printer methods
        NumberPrinter.printEvenNumbers();
        NumberPrinter.printOddNumbers();

        // Wait for both threads to complete
        try {
            Thread.sleep(1500); // Adjust the sleep time based on the thread processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the output
        String expectedOutput = "Even: 2\nEven: 4\nEven: 6\n";
        expectedOutput += "Odd: 1\nOdd: 3\nOdd: 5\n";
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }
}
