import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int range = inputObj.nextInt();
        inputObj.close();

        int start = 0, start2 = 1, sum = 0, i = 0;

        System.out.println("\nFirst" + "\t" + "Second" + "\t" + "Golden Ratio");

        while (i <= range) {
            sum = start + start2;
            System.out.println(start + "\t" + start2 + "\t" + (double) start2 / start);

            start = start2;
            start2 = sum;

            i++;
        }
    }
}
