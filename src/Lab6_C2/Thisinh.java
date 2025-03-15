package Lab6_C2;

import java.util.Scanner;

public class Thisinh {
    private int id;
    private String name;
    private String address;
    private float score1, score2, score3, extra;

    public Thisinh() {}
    public Thisinh(int id, String Name, String address, float score1, float score2, float score3, float extra) {
        this.id = id;
        this.name = Name;
        this.address = address;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.extra = extra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getScore1() {
        return score1;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public float getScore2() {
        return score2;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    public float getScore3() {
        return score3;
    }

    public void setScore3(float score3) {
        this.score3 = score3;
    }

    public float getExtra() {
        return extra;
    }

    public void setExtra(float extra) {
        this.extra = extra;
    }

    public float totalScore() {
        return getScore1() + getScore2() + getScore3() + getExtra();
    }

    public void input(Scanner sc) {
        System.out.print("Nhap SBD: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.print("Nhap diem mon 1: ");
        score1 = sc.nextFloat();
        System.out.print("Nhap diem mon 2: ");
        score2 = sc.nextFloat();
        System.out.print("Nhap diem mon 3: ");
        score3 = sc.nextFloat();
        System.out.print("Nhap diem uu tien: ");
        extra = sc.nextFloat();
    }

    public String toString() {
        return "SBD: " + getId() + ", Ho ten: " + getName() + ", Dia chi: " + getAddress() + "\nM1: " + getScore1() + ", M2: " + getScore2() + ", M3: " + getScore3() + ", UT: " + getExtra() + "\nTong diem: " + totalScore() + "\n";
    }
}
