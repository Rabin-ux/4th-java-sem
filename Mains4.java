import java.util.ArrayList;
import java.util.List;

// 1. Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// 2. Account Class
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in " + accountNumber);
        }
        balance -= amount;
    }

    public void transfer(Account target, double amount) throws InsufficientFundsException {
        this.withdraw(amount);
        target.deposit(amount);
    }

    public void displayAccountDetails() {
        System.out.println("Account: " + accountNumber + " | Holder: " + accountHolderName + " | Balance: $" + balance);
    }

    public String getAccountNumber() { return accountNumber; }
}

// 3. Bank Class
class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String id, String name, double bal) {
        accounts.add(new Account(id, name, bal));
    }

    public Account getAccount(String id) {
        for (Account a : accounts) if (a.getAccountNumber().equals(id)) return a;
        return null;
    }

    public void displayAllAccounts() {
        for (Account a : accounts) a.displayAccountDetails();
    }
}

// 4. Main Class (Must match filename mains4.java exactly)
public class Mains4 {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.createAccount("ACC1", "Alice", 1000.0);
        myBank.createAccount("ACC2", "Bob", 500.0);

        try {
            Account alice = myBank.getAccount("ACC1");
            Account bob = myBank.getAccount("ACC2");
            
            System.out.println("Transferring $300 from Alice to Bob...");
            alice.transfer(bob, 300);
            
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        myBank.displayAllAccounts();
    }
}