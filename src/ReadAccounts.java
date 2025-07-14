import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAccounts {
    BufferedReader reader ;
    public ReadAccounts(String filename) {
        try {
            reader = new BufferedReader(new FileReader(filename));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Account> getAccounts() {
        List<Account> accounts = new LinkedList<>();
        String line ;
        try {
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String firstName = data[0];
                String lastName = data[1];
                String accountNumber = data[2];
                double balance = Double.parseDouble(data[3]);
                Account account=new Account(firstName,lastName,accountNumber,balance);
                accounts.add(account);
            }
            return accounts;
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
