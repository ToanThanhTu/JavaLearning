public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("98765", 4000.0,
                "Mate", "mate@gmail.com", "098765432");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email,
                       String phoneNumber) {
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999999", 3000.0, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void deposit(double number) {
        balance += number;
        System.out.println("Deposit of $" + number + " made.");
        printBalance();
    }

    public void withdraw(double number) {
        if (balance - number < 0) {
            System.out.println("Not enough balance. You only have $" + balance + " in your account.");
            return;
        }
        balance -= number;
        System.out.println("Withdrawal of $" + number + " made.");
        printBalance();
    }

    public void printBalance() {
        System.out.println("Balance: $" + balance);
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
