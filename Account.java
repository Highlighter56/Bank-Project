

public class Account {

    // Attributes
    private double balance;
    private String username;
    private String password;

    // Constructors
    public Account(double balance, String username, String password) {
        this.balance=balance;
        this.username=username;
        this.password=password;
    }
    public Account(String username, String password) {
        this(0, username, password);
    }


    // Getters
    public double getBalance() {
        return balance;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    
    // Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Methods
    public void deposite(double newMoney) {
        setBalance(balance + newMoney);
    }
    public double withdraw(double moneyToTake) {
        if(moneyToTake > balance) {
            setBalance(balance - moneyToTake);
            return moneyToTake;
        } else {
            System.out.println("You account does not have the balance to make this transaction.");
        }
        return 0;
    }
    
    // toString
    public String toString() {
        return username+": "+balance;
    }

}