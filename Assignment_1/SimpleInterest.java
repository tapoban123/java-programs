import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter Initial balance = ");
        float balance = inputObj.nextInt();

        System.out.print("Enter Interest Rate = ");
        float interestRate = inputObj.nextFloat();

        System.out.print("Enter Number of years = ");
        int years = inputObj.nextInt();

        inputObj.close();

        float oldBalance = balance, newBalance = 0, interest;

        System.out.println("Year" + "\t" + "Old Balance" + "\t" + "Interest" + "\t" + "New Balance");
        for (int i = 1; i <= years; i++) {
            if (i != 1)
                oldBalance = newBalance;

            interest = (balance * interestRate * i) / 100;
            newBalance = oldBalance + interest;

            System.out.println(i + "\t" + oldBalance + "\t\t" + interest + "\t\t" + newBalance);
        }
    }
}
