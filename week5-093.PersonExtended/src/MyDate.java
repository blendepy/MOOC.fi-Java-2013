
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate compared) {
        int totalDays1 = this.day + (this.month * 30) + (this.year * 365);
        int totalDays2 = compared.day + (compared.month * 30) + (compared.year * 365);

        int daysDifferent = 0;
        if (totalDays1 == totalDays2) {
            return 0;
        } else if (totalDays1 > totalDays2) {
            daysDifferent = totalDays1 - totalDays2;
        } else {
            daysDifferent = totalDays2 - totalDays1;
        }

        return (int) daysDifferent / 365;
    }
}
