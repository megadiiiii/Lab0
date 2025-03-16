package Lab6_C2;

import java.util.Scanner;

public class Thisinh {
    private int id;
    private String name;
    private String address;
    private float extra;

    public Thisinh() {}
    public Thisinh(int id, String Name, String address, float score1, float score2, float score3, float extra) {
        this.id = id;
        this.name = Name;
        this.address = address;
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

    public float getExtra() {
        return extra;
    }

    public void setExtra(float extra) {
        this.extra = extra;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap SBD: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.print("Nhap diem uu tien: ");
        extra = sc.nextFloat();
        sc.nextLine();
    }

    public String toString() {
        return "SBD: " + getId() + ", Ho ten: " + getName() + ", Dia chi: " + getAddress() + ", UT: " + getExtra() + "\n";
    }
}
