import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        ReadAccounts reader = new ReadAccounts("Accounts.csv");
//        List<Account> accountList = reader.getAccounts();
//
//        System.out.println("----- Initial Account Details -----");
//        for (Account account : accountList) {
//            System.out.println(account.toString());
//        }
//
//        // First group of transactions
//        Account acc = accountList.get(0);
//        Account acc1 = accountList.get(3);
//
//
//        acc.deposit(2000);
//
//
//        acc.withdraw(2344);
//
//
//        Transaction t = new Transaction();
//        t.transfer(acc, acc1, 500);
//
//        System.out.println("\n----- Account Details After First Transaction-----");
//        for (Account account : accountList) {
//            System.out.println(account.toString());
//        }
//
//        // Second group of transactions
//        Account acc3 = accountList.get(2);
//        Account acc4 = accountList.get(3);
//
//
//        acc3.deposit(2000);
//
//
//        acc4.withdraw(499);
//
//
//        Transaction n = new Transaction();
//        n.transfer(acc3, acc4, 4343);
//
//        System.out.println("\n----- Account Details After Second Transactions -----");
//        for (Account account : accountList) {
//            System.out.println(account.toString());
//        }
//    }
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
