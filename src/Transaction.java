public class Transaction {
    public Transaction() {
    }

    public void transfer(Account acc1, Account acc2, double amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}