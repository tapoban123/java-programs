import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inputObj.nextInt();
        inputObj.close();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }
}