package Lab5_2_C2;

import java.util.Scanner;
import java.util.ArrayList;

public class QLCB {
    Scanner sc = new Scanner(System.in);
    ArrayList<Canbo> List = new ArrayList<>();

    public void addCB() {
        int choice;
        do {
            System.out.println("Nhap loai can bo: 1. Cong nhan, 2. Nhan vien, 3. Ky su");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice < 1 || choice > 3) {
                System.out.println("Lua chon khong hop le! Vui long nhap lai.");
            }
        } while (choice < 1 || choice > 3);

        Canbo cb = null;
        switch (choice) {
            case 1:
                cb = new Congnhan();
                break;
            case 2:
                cb = new Nhanvien();
                break;
            case 3:
                cb = new Kysu();
                break;
        }
        cb.Input(sc);
        List.add(cb);
    }

    public void Display() {
        if (List.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (Canbo cb : List) {
                System.out.println(cb);
            }
        }
    }

    public void Search() {
        System.out.print("Nhap ten nhan vien can tim kiem: ");
        String search = sc.nextLine();
        boolean found = false;
        System.out.println("Danh sach nhan vien:");
        for (Canbo cb : List) {
            if (cb.getName().equalsIgnoreCase(search)) {
                System.out.println(cb);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay");
        }
    }

    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Nhap thong tin can bo");
            System.out.println("2. Tim kiem nhan vien theo ten");
            System.out.println("3. Thong tin can bo");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    qlcb.addCB();
                    break;
                case 2:
                    qlcb.Search();
                    break;
                case 3:
                    System.out.println("Danh sach nhan vien: ");
                    qlcb.Display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
            }
        }
    }
}
