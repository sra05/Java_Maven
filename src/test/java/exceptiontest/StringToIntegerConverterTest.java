package exceptiontest;
import org.junit.Test;
import exception.StringToIntegerConverter;
import static org.junit.Assert.*;

public class StringToIntegerConverterTest {

    @Test
    public void testConvertStringToIntValidInput() {
        // Test valid input
        assertEquals(23, StringToIntegerConverter.convertStringToInt("23"));
    }

    @Test
    public void testConvertStringToIntInvalidInput1() {
        // Test invalid input: decimal number
        try {
            StringToIntegerConverter.convertStringToInt("45.67");
            fail("Expected NumberFormatException was not thrown");
        } catch (NumberFormatException e) {
            // Expected exception, do nothing
        }
    }

    @Test
    public void testConvertStringToIntInvalidInput2() {
        // Test invalid input: non-numeric characters
        try {
            StringToIntegerConverter.convertStringToInt("test");
            fail("Expected NumberFormatException was not thrown");
        } catch (NumberFormatException e) {
            // Expected exception, do nothing
        }
    }

    @Test
    public void testConvertStringToIntInvalidInput3() {
        // Test invalid input: alphanumeric characters
        try {
            StringToIntegerConverter.convertStringToInt("123f");
            fail("Expected NumberFormatException was not thrown");
        } catch (NumberFormatException e) {
            // Expected exception, do nothing
        }
    }
}