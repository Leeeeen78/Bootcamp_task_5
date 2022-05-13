package Task_5;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Before
    public void setup(){
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount(550);
        bankAccount.withdraw(567);
        assertEquals(550, bankAccount.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void transferMoney() {
        BankAccount bankAccount = new BankAccount(50);
        BankAccount transfer = new BankAccount(50);

        bankAccount.transferMoney(50, transfer);

        assertEquals(50, transfer.getBalance());


    }

    @After
    public void close(){

    }

}