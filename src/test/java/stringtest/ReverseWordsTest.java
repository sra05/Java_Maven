package stringtest;
import strings.ReverseWords;

import org.junit.Test;
//import strings.ReverseString;
import static org.junit.Assert.assertEquals;
public class ReverseWordsTest{

    @Test
    public void testReverseWords() {
        // Test case 1: Basic reversal
        assertEquals("123!#@ dcba", ReverseWords.reverseWords("@#!321 abcd"));

        assertEquals("avaJ EE2J esreveR eM", ReverseWords.reverseWords("Java J2EE Reverse Me"));

        // Test case 2: Reversal with different lengths and spaces
        assertEquals("edoc taht a peek I", ReverseWords.reverseWords("code that a keep I"));

        // Test case 3: Reversal with numbers and special characters

        // Test case 4: Empty input
        assertEquals("", ReverseWords.reverseWords(""));

        // Test case 5: Null input
        assertEquals("llun", ReverseWords.reverseWords("null"));

        // Add more test cases as needed
    }
}