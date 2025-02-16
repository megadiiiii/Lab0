package Lab0;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInfo() {
        return day + "/" + month + "/" + year;
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate.getInfo());
        MyDate myDate2 = new MyDate(1, 12, 2231);
        System.out.println(myDate2.getInfo());
    }
}