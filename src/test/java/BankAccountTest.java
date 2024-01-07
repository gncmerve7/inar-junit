package test.java;
import main.java.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*Test Case 1: Deposit into Account
Test Case 2: Withdraw from Account with Sufficient Funds
Test Case 3: Withdraw from Account Exceeding Balance
Test Case 4: Deposit Negative Amount
Test Case 5: Withdraw Negative Amount*/

public class BankAccountTest {
    BankAccount initialBalance = new BankAccount();

    @Test
    void depositIntoAccount() {
        initialBalance.deposit(1500);
        double currentBalance = initialBalance.getBalance();
        assertEquals(1500, currentBalance);
    }

    @Test
    void withdrawWithSufficientFunds() {
        initialBalance.deposit(130);
        initialBalance.withdraw(10);
        double currentBalance = initialBalance.getBalance();
        System.out.println(currentBalance);
        assertEquals(120, currentBalance);
    }

    @Test
    void withdrawExceedingBalance() {
        try {
            initialBalance.withdraw(20000);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            assertEquals("Insufficient funds", e.getMessage());
        }
    }

    @Test
    void depositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> initialBalance.deposit(-100));
    }

    @Test
    void withdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> initialBalance.withdraw(-100));
    }
}

