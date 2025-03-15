package Lab6_C1;

import java.util.Scanner;

public class Tapchi extends Tailieu {
    private int soPH;
    private int thangPH;

    public Tapchi() {}
    public Tapchi(String id, String nxb, int sobanph, int soPH, int thangPH) {
        super(id, nxb, sobanph);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    public void Input(Scanner sc) {
        super.Input(sc);
        System.out.print("Nhap so phat hanh: ");
        soPH = sc.nextInt();
        System.out.print("Nhap thang phat hanh: ");
        thangPH = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + ", Tap chi: So phat hanh: " + getSoPH() + ", Thang phat hanh: " + getThangPH();
    }
}
