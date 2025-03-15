package Lab6_C1;

import java.util.Scanner;

public class Sach extends Tailieu {
    private String author;
    private String page_number;

    public Sach() {
    }

    public Sach(String id, String nxb, int sobanph, String author, String page_number) {
        super(id, nxb, sobanph);
        this.author = author;
        this.page_number = page_number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPage_number() {
        return page_number;
    }

    public void setPage_number(String page_number) {
        this.page_number = page_number;
    }

    @Override
    public void Input(Scanner sc) {
        super.Input(sc);
        System.out.print("Nhap ten tac gia: ");
        this.author = sc.nextLine();
        System.out.print("Nhap so trang: ");
        this.page_number = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Sach: Tac gia: " + getAuthor() + ", So trang: " + getPage_number();
    }
}
