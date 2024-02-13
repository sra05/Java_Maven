package customexceptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class BankAccTest {


    @Test
    void testSuccessfulWithdrawal() throws InsufficientFundsExcp, InvalidWithdrawalExcp {
        BankAcc account = new BankAcc(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdrawMoreThanBalance() {
        BankAcc account = new BankAcc(1000);
        assertThrows(InsufficientFundsExcp.class, () -> account.withdraw(1500));
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAcc account = new BankAcc(1000);
        assertThrows(InvalidWithdrawalExcp.class, () -> account.withdraw(-200));
    }

}