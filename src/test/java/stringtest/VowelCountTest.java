package stringtest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import strings.VowelCount;

public class VowelCountTest {


    @Test
    public void testCountVowels() {
        // Test case 1: String with no vowels
        assertEquals(0, VowelCount.countVowels("xyz"));

        // Test case 2: String with all vowels
        assertEquals(5, VowelCount.countVowels("aeiou"));

        // Test case 3: String with a mix of vowels and consonants
        assertEquals(2, VowelCount.countVowels("hello"));


        // Test case 4: Empty string
        assertEquals(0, VowelCount.countVowels(""));

        // Test case 5: String with uppercase and lowercase vowels
        assertEquals(10, VowelCount.countVowels("aAEeIiOoUu"));

        // Test case 6: String with numbers and special characters
        assertEquals(1, VowelCount.countVowels("h3llo!"));

        // Test case 7: String with spaces
        assertEquals(3, VowelCount.countVowels("hello world"));

        // Test case 8: String with only spaces
        assertEquals(0, VowelCount.countVowels("   "));

        // Test case 9: String with non-alphabetic characters
        assertEquals(0, VowelCount.countVowels("12345"));

        // Test case 10: String with non-English characters
        assertEquals(0, VowelCount.countVowels("áéî"));
    }
}