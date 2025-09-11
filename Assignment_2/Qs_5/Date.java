package Qs_5;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        if (day == 0) {
            this.day = 1;
        } else {
            if (day <= 31 && day > 0)
                this.day = day;
            else
                System.out.println("Invalid day number.");
        }

        if (month == 0) {
            this.month = 1;
        } else {
            if (month <= 12 && month > 0)
                this.month = month;
            else
                System.out.println("Month number not valid.");
        }

        if (year == 0) {
            this.year = 1800;
        } else
            this.year = year;
    }

    public int differenceInDays(Date date) {
        int years;
        int months;
        int days;
        int totalDays;

        if (date.year > this.year)
            years = date.year - this.year;
        else
            years = this.year - date.year;

        if (date.month > this.month)
            months = date.month - this.month;
        else
            months = this.month - date.month;

        if (date.day > this.day)
            days = date.day - this.day;
        else
            days = this.day - date.day;

        totalDays = 365 * years + 30 * months + days;
        return totalDays;
    }

    public void addDays(int n) {
        int days = this.day + n;
        if (days > 30) {
            int months = this.month + days / 30;
            if (months > 12) {
                this.year += months / 365;
            }
            this.month += months;
            if (this.month > 12)
                this.month -= 12;
        }
        this.day += days;
        if (this.day > 30)
            this.day -= 30;
    }

    public void subtractDays(int n) {
        int days = this.day - n;
        if (days < 0) {
            int months = this.month + days / 30;
            if (months < 0) {
                this.year += months / 365;
            }
            this.month += months;
            if (this.month < 0)
                this.month = 12 + this.month;
        }
        this.day += days;
        if (this.day < 0)
            this.day = 30 + this.day;
    }

    public String toString() {
        return String.format("%d-%d-%d", this.day, this.month, this.year);
    }

    public boolean isSameDate(Date date) {
        if (date.day == this.day && this.month == date.month && this.year == date.year)
            return true;
        return false;
    }
}
