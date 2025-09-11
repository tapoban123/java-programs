package Qs_4;

public class Account {
    String accountHolderName;
    int accountNumber;
    char accountType;
    float balance;
    static int transactions;

    public Account(
            String holderName,
            int accoutNumber,
            char accoutType,
            float balance) {
        this.accountHolderName = holderName;
        this.accountNumber = accoutNumber;
        this.accountType = accoutType;
        this.balance = balance;
        transactions = 0;
    }

    public void setName(String newName) {
        this.accountHolderName = newName;
    }

    public void setAccountNumber(int newNumber) {
        this.accountNumber = newNumber;
    }

    public void setAccountType(char type) {
        this.accountType = type;
    }

    public void setBalance(float amount) {
        this.balance = amount;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public char getAccountType() {
        return this.accountType;
    }

    public float getCurrentBalance() {
        return this.balance;
    }

    public void deposit(float amount) {
        this.balance += amount;
        transactions++;
    }

    public void withdraw(float amount) {
        this.balance -= amount;
        transactions++;
    }

    public String toString() {
        return String.format("Account Holder: %s%nAccount Number: %d%nAccount Type: %c%nCurrent Balance: %.2f",
                this.accountHolderName,
                this.accountNumber, this.accountType, this.balance);
    }
}
