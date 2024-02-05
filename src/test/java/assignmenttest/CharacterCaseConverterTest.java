package assignmenttest;
import assignments.CharacterCaseConverter;
import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterCaseConverterTest {

    @Test
    public void testConvertCase() {
        String input = "Hello World";
        String expected = "hELLO wORLD";
        assertEquals(expected, CharacterCaseConverter.convertCase(input));
    }

    @Test
    public void testConvertCaseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, CharacterCaseConverter.convertCase(input));
    }
}

