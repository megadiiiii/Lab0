package Lab5_2_C2;

import java.util.Scanner;

public class Nhanvien extends Canbo {
    private String job;

    public Nhanvien() {
    }

    public Nhanvien(String name, int dob, String gender, String address, String job) {
        super(name, dob, gender, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void Input(Scanner sc) {
        super.Input(sc);
        System.out.print("Nhap cong viec: ");
        job = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Nhan vien: " + getJob();
    }
}
