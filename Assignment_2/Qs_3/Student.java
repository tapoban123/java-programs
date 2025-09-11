package Qs_3;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public int[] getMarks() {
        return this.marks;
    }

    private int getTotal() {
        int sum = 0;
        for (int m : this.marks)
            sum += m;

        return sum;
    }

    public float calcAvg() {
        return getTotal() / this.marks.length;
    }

    public char calcLetterGrade() {
        float totalPercent = ((float) getTotal() / 500) * 100;

        if (totalPercent >= 90)
            return 'A';
        else if (totalPercent >= 70)
            return 'B';
        else if (totalPercent >= 50)
            return 'C';
        else if (totalPercent >= 30)
            return 'D';
        else
            return 'F';
    }

    public String toString() {
        return String.format("Name: %s%nMarks: %s", this.name, Arrays.toString(this.marks));
    }
}
