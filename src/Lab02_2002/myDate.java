//Tạo một lớp MyDate có 3 thuộc tính ngày, tháng, năm [ myDate(int date, mouth, year) ]
//a. Xây dựng hai phương thức khởi tạo (một phương thức không có tham số và một phương thức có tham
//        số có kiểu là chính lớp đó)
//b. Tạo một phưong thức nhập từ bàn phím và in ra màn hình

import java.util.Scanner;

public class myDate {
    private int date, month, year;

    public myDate() {
        this.date = 01;
        this.month = 01;
        this.year = 1970;
    }

    public myDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
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

    public void inp() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date: ");
        this.date = in.nextInt();
        System.out.print("Enter month: ");
        this.month = in.nextInt();
        System.out.print("Enter year: ");
        this.year = in.nextInt();
    }

    public String display() {
        return  date + "/" + month + "/" + year;
    }

    public static void main(String[] args) {
        myDate d1 = new myDate();
        System.out.println(d1.display());
        myDate d2 = new myDate();
        d2.inp();
        System.out.println(d2.display());
        myDate d3 = new myDate(1,2,4);
        System.out.println(d3.display());
    }
}