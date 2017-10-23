package bankaccountapp;

public abstract class Account implements IBaseRate {

    // List common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    private String setAccountNumber() {
        String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSSN + uniqueID + randomNumber;
    }

    public abstract void setRate();

    public void compound() {
        double accountInterest = balance * (100 / rate);
        System.out.println("Account Interest " + accountInterest);
        balance += accountInterest;
        printBalance();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfer $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println("Account{" +
                "name='" + name + '\'' +
                ", sSN='" + sSN + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", rate=" + rate +
                '}');
    }
}
