package Qs_5;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        if (day == 0) {
            this.day = 1;
        } else
            this.day = day;

        if (month == 0) {
            this.month = 1;
        } else
            this.month = month;

        if (year == 0) {
            this.year = 1800;
        } else
            this.year = year;
    }

    public int differenceInDays() {
    }

    public int addDays() {

    }

    public int subtractDays() {

    }

    public String toString() {

    }

    public boolean compareDays() {

    }
}
