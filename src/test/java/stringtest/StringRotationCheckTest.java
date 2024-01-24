package stringtest;
import strings.StringRotationCheck;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StringRotationCheckTest {


    @Test
    public void testIsRotation() {
        // Test case 1: Rotations
        assertTrue(StringRotationCheck.isRotation("abcde", "cdeab"));

        // Test case 2: Not rotations with different lengths
        assertFalse(StringRotationCheck.isRotation("hello", "world"));

        // Test case 3: Not rotations with empty strings
        assertFalse(StringRotationCheck.isRotation("", "abcd"));

        // Test case 4: Rotations with spaces
        assertTrue(StringRotationCheck.isRotation("hello world", "worldhello "));

        // Test case 5: Rotations with special characters
        assertTrue(StringRotationCheck.isRotation("!@#$%", "%!@#$"));

        // Test case 6: Rotations with numbers
        assertTrue(StringRotationCheck.isRotation("12345", "34512"));

        // Test case 7: Not rotations with different characters
        assertFalse(StringRotationCheck.isRotation("abc", "def"));

        // Test case 8: Rotations with repeated characters
        assertTrue(StringRotationCheck.isRotation("aabbaabb", "bbaabbaa"));

        // Test case 9: Rotations with same string
        assertTrue(StringRotationCheck.isRotation("abc", "abc"));

        // Test case 10: Rotations with single-character strings
        assertTrue(StringRotationCheck.isRotation("a", "a"));
    }
}


