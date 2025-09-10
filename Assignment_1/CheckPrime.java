import java.util.Scanner;

class CheckPrime {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputObj.nextInt();
        inputObj.close();

        int factors = 0;

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                factors++;
                if (number / i != i)
                    factors++;
            }
        }

        if (factors == 2)
            System.out.println(number + " is a Prime number.");
        else
            System.out.println(number + " is not a Prime number.");
    }
}
