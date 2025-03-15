package Lab6_C1;

import java.util.Scanner;

public class Tailieu {
    private String id;
    private String nxb;
    private int sobanph;

    public Tailieu() {}
    public Tailieu(String id, String nxb, int sobanph) {
        this.id = id;
        this.nxb = nxb;
        this.sobanph = sobanph;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSobanph() {
        return sobanph;
    }

    public void setSobanph(int sobanph) {
        this.sobanph = sobanph;
    }

    public void Input(Scanner sc) {
        System.out.print("Nhap ma tai lieu: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ten NXB: ");
        this.nxb = sc.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        this.sobanph = sc.nextInt();
        sc.nextLine();
    }

    public String toString() {
        return "Ma tai lieu: " + getId() + ", NXB: " + getNxb() + ", So ban phat hanh: " + getSobanph();
    }
}
