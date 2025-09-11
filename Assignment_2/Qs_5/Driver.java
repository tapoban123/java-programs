package Qs_5;

import java.util.Scanner;

public class Driver {
    static void menu() {
        System.out.println("OPERATIONS:");
        System.out.println("Enter 1 to add days.");
        System.out.println("Enter 2 to subtract days.");
        System.out.println("Enter 3 to find difference in days.");
        System.out.println("Enter 4 to view date.");
        System.out.println("Enter 5 to compare date.");
        System.out.println("Enter 0 to exit.");
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = inputObj.nextInt();

        System.out.print("Enter month: ");
        int month = inputObj.nextInt();

        System.out.print("Enter year: ");
        int year = inputObj.nextInt();

        Date myDate = new Date(day, month, year);

        boolean reRun = true;
        menu();

        while (reRun) {
            int userChoice = inputObj.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.print("Enter number of days: ");
                    int days = inputObj.nextInt();
                    myDate.addDays(days);
                    break;
                case 2:
                    System.out.print("Enter number of days: ");
                    int subDays = inputObj.nextInt();
                    myDate.subtractDays(subDays);
                    break;
                case 3:
                    System.out.print("Enter day: ");
                    int newDay = inputObj.nextInt();

                    System.out.print("Enter month: ");
                    int newMonth = inputObj.nextInt();

                    System.out.print("Enter year: ");
                    int newYear = inputObj.nextInt();

                    Date newDate = new Date(newDay, newMonth, newYear);

                    System.out.println("Difference = " + myDate.differenceInDays(newDate));
                    break;
                case 4:
                    System.out.println(myDate.toString());
                    break;
                case 5:
                    System.out.print("Enter day: ");
                    int newDay2 = inputObj.nextInt();

                    System.out.print("Enter month: ");
                    int newMonth2 = inputObj.nextInt();

                    System.out.print("Enter year: ");
                    int newYear2 = inputObj.nextInt();

                    Date newDate2 = new Date(newDay2, newMonth2, newYear2);

                    if (myDate.isSameDate(newDate2))
                        System.out.println("The dates are same.");
                    else
                        System.out.println("The dates are not the same.");
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
