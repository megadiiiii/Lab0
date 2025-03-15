package Lab6_C1;

import java.util.Scanner;

public class Bao extends Tailieu {
    private int ngayPH;

    public Bao() {}
    public Bao(String id, String nxb, int sobanph, int ngayPH) {
        super(id, nxb, sobanph);
        this.ngayPH = ngayPH;
    }

    public int getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(int ngayPH) {
        this.ngayPH = ngayPH;
    }

    @Override
    public void Input(Scanner sc) {
        super.Input(sc);
        System.out.print("Nhap ngay PH: ");
        ngayPH = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Bao: Ngay phat hanh: " + getNgayPH();
    }
}
