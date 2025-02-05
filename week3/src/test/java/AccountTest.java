import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    void deposit() {
        account.deposit(-20.0);
        assertEquals(0.0, account.getBalance(), "Depositing a negative amount should not alter the balance");
        account.deposit(20.0);
        assertEquals(20.0, account.getBalance(), "Depositing a positive amount should alter the balance");
    }

    @Test
    void withdraw() {
        account.deposit(20.0);
        assertEquals(0.0, account.withdraw(-20.0), "Withdrawing a negative amount should return 0.0");
        assertEquals(0.0, account.withdraw(30.0), "Withdrawing an amount greater than the balance should return 0.0");
        assertEquals(20.0, account.getBalance(), "Withdrawing an amount greater than the balance should not alter the balance");
        assertEquals(10.0, account.withdraw(10.0), "Withdrawing an amount less than the balance should return the amount");
        assertEquals(10.0, account.getBalance(), "Withdrawing an amount less than the balance should alter the balance");
    }

    @Test
    void getBalance() {
        assertEquals(0.0, account.getBalance(), "The initial balance should be 0.0");
        account.deposit(20.0);
        assertEquals(20.0, account.getBalance(), "The balance should be 20.0 after depositing 20.0");
        account.withdraw(10.0);
        assertEquals(10.0, account.getBalance(), "The balance should be 10.0 after withdrawing 10.0");
    }
}