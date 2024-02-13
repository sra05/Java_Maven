package customexceptions;

public class BankAcc {
    private double balance;

    public BankAcc(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsExcp, InvalidWithdrawalExcp {
        if (amount < 0) {
            throw new InvalidWithdrawalExcp("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsExcp("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
