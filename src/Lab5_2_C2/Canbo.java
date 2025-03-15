package Lab5_2_C2;

import java.util.Scanner;

public class Canbo {
    private String name;
    private int dob;
    private String gender;
    private String address;

    public Canbo() {}
    public Canbo(String name, int dob, String gender, String address) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Input(Scanner sc) {
        System.out.print("Nhap ten can bo: ");
        name = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        dob = sc.nextInt();
        System.out.print("Nhap gioi tinh: ");
        gender = sc.next();
        System.out.print("Nhap dia chi: ");
        address = sc.next();
        sc.nextLine();
    }


    public String toString() {
        return "Ten: " + getName() + ", Nam sinh: " + getDob() + ", Gioi tinh: " + getGender() + ", Dia chi: " + getAddress();
    }
}
