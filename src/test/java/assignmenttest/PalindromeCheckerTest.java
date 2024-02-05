package assignmenttest;
import assignments.PalindromeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(PalindromeChecker.isPalindrome(1221));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(PalindromeChecker.isPalindrome(12345));
    }
}