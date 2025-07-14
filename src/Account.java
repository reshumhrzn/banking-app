public class Account extends Customer{
    private Double balance;
    private String accountNumber;
    public Account(String FName, String LName, String accountNumber, double balance ){
        super.setFirstName(FName);
        super.setLastName(LName);
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public Double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }

    @Override
    public String toString() {
        return super.getFirstName() +","+ super.getLastName() +","+ balance+","+accountNumber;
    }
}