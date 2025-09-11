package Qs_4;

import java.util.Scanner;;

public class Driver {
    private static void menu() {
        System.out.println("OPERATIONS:");
        System.out.println("Enter 1 to deposit.");
        System.out.println("Enter 2 to withdraw.");
        System.out.println("Enter 3 to view current balance.");
        System.out.println("Enter 4 to view number of transactions.");
        System.out.println("Enter 5 to view account details.");
        System.out.println("Enter 0 to exit.");
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String holderName = inputObj.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = inputObj.nextInt();

        System.out.print("Enter Account Type (S for Savings /C for Current): ");
        char accountType = inputObj.next().charAt(0);

        System.out.print("Enter balance: ");
        float balance = inputObj.nextFloat();

        Account accountObj = new Account(holderName, accountNumber, accountType, balance);

        menu();

        boolean reRun = true;

        while (reRun) {
            System.out.print("Enter your choice: ");
            int userChoice = inputObj.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    float amount = inputObj.nextFloat();
                    accountObj.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    float amt = inputObj.nextFloat();
                    accountObj.withdraw(amt);
                    break;
                case 3:
                    System.out.println("Current balance = " + accountObj.getCurrentBalance());
                    break;
                case 4:
                    System.out.println("Number of transactions = " + Account.transactions);
                    break;
                case 5:
                    System.out.println(accountObj.toString());
                    break;
                case 0:
                    System.out.println("Program executed successfully.");
                    reRun = false;
                    break;
            }
        }

        inputObj.close();
    }
}
