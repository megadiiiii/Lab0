package Lab5_2_C2;

import java.util.Scanner;

public class Kysu extends Canbo {
    private String major;

    public Kysu() {}
    public Kysu(String name, int dob, String gender, String address, String major) {
        super(name, dob, gender, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void Input(Scanner sc) {
        super.Input(sc);
        System.out.print("Nhap chuyen nganh: ");
        major = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Ky su: " + getMajor();
    }
}
