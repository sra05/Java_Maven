package stringtest;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import strings.AnagramCheck;

public class AnagramCheckTest {

    @Test
    public void testCheckAnagrams() {
        // Test case 1: Anagrams
        assertTrue(AnagramCheck.checkAnagrams("listen", "silent"));

        // Test case 2: Not Anagrams
        assertFalse(AnagramCheck.checkAnagrams("hello", "world"));

        // Test case 3: Anagrams with different case
        assertTrue(AnagramCheck.checkAnagrams("Act", "Cat"));

        // Test case 4: Anagrams with spaces
        assertTrue(AnagramCheck.checkAnagrams("astronomer", "moon starer"));

        // Test case 5: Anagrams with special characters
        assertTrue(AnagramCheck.checkAnagrams("debit card", "bad credit"));

        // Test case 6: Not Anagrams with different lengths
        assertFalse(AnagramCheck.checkAnagrams("cat", "tacooo"));

        // Test case 7: Anagrams with repeated characters
        assertTrue(AnagramCheck.checkAnagrams("aab", "aba"));

        // Add more test cases as needed
    }

}