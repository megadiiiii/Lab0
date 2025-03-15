package Lab5_2_C2;

import java.util.Scanner;

public class Congnhan extends Canbo {
    private int bac_cn;

    public Congnhan() {}
    public Congnhan(String name, int dob, String gender, String address, int bac_cn) {
        super(name, dob, gender, address);
        this.bac_cn = bac_cn;
    }

    public int getBac_cn() {
        return bac_cn;
    }

    public void setBac_cn(int bac_cn) {
        this.bac_cn = bac_cn;
    }

    public void Input(Scanner sc) {
        super.Input(sc);
        System.out.print("Nhap bac cong nhan (Tu 1-7): ");
        do {
            bac_cn = sc.nextInt();
            sc.nextLine();
        } while (bac_cn < 1 || bac_cn > 7);
    }

    @Override
    public String toString() {
        return super.toString() + ", Cong nhan bac: " + getBac_cn() + "/7";
    }
}
