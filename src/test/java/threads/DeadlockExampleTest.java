package threads;
import org.junit.Test;

//public class DeadlockExampleTest {
//
//    @Test(timeout = 1000)
//    public void testDeadlockCreation() {
//        DeadlockExample.createDeadlock();
//        // If deadlock occurs, the test will not finish within the timeout
//    }

import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {

    @Test(timeout = 1000)
    public void testDeadlockCreation() {
        try {
            DeadlockExample.createDeadlock();
            fail("Expected a deadlock to occur, but it didn't.");
        } catch (Exception e) {
            // If a deadlock occurs, it will be caught here
            assertTrue(false);
        }
    }
}


