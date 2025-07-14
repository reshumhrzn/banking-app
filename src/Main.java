import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("Reshu", "Ting", "1", 2000);
        Account account2 = new Account("Lasta", "Ping", "2", 1000);

        System.out.println("Reshu's Balance: " + account1.getBalance());
        System.out.println("Lasta's Balance: " + account2.getBalance());

        account1.deposit(250);
        System.out.println("Reshu's Balance after deposit: " + account1.getBalance());

        account2.withdraw(500);
        System.out.println("Lasta's Balance after withdrawal: " + account2.getBalance());

        Transaction t = new Transaction();
        t.transfer(account1, account2, 250);

        System.out.println("Final Reshu's Balance after transfer: " + account1.getBalance());
        System.out.println("Final Lasta's Balance after transfer: " + account2.getBalance());
    }
}
