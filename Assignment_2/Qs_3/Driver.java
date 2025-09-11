package Qs_3;

import java.util.Scanner;;

class Driver {
    public static void main(String[] args) {
        int n = 5, i = 0;
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String name = inputObj.nextLine();
        int[] marks = new int[n];

        while (i < n) {
            System.out.print("Enter marks: ");
            marks[i] = inputObj.nextInt();
            i++;
        }

        inputObj.close();

        Student student = new Student(name, marks);
        System.out.println("Average = " + student.calcAvg());
        System.out.println("Grade = " + student.calcLetterGrade());
        System.out.println(student.toString());
    }
}
