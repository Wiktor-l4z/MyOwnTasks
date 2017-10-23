package bankaccountapp;

import utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    static private CSV csv;
    static String file = "C:\\Users\\l4z\\Desktop\\bank.csv";

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<>();


      /*  Checking chacc1 = new Checking("Wiktor Tygrys", "934569123", 1500);

        Savings savings = new Savings("Michał Lowe", "345432679", 2500);

        chacc1.showInfo();
        System.out.println("******************************************");
        savings.showInfo();

        savings.deposit(5000);
        savings.withdraw(200);
        savings.transfer("Brokerage",5000);
        savings.compound();*/

        // Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = csv.read(file);
        for (String[] accountHolder : newAccountHolders
                ) {
            System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountHolder.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n*****************");
            acc.showInfo();
        }
    }
}
