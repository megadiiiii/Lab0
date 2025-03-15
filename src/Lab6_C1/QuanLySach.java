package Lab6_C1;

import java.util.Scanner;
import java.util.ArrayList;

public class QuanLySach {
    Scanner sc = new Scanner(System.in);
    ArrayList<Tailieu> List = new ArrayList<>();

    public void Add() {
        int choice;
        Tailieu tl = null;
        do {
            System.out.println("Chon loai tai lieu: 1. Sach, 2. Tap chi, 3. Bao");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    tl = new Sach();
                    break;
                case 2:
                    tl = new Tapchi();
                    break;
                case 3:
                    tl = new Bao();
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while (tl == null);


        tl.Input(sc);
        List.add(tl);
    }

    public void Display() {
        if (List.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (Tailieu tl : List) {
                System.out.println(tl);
            }
        }
    }

    public void Search() {
        if (List.isEmpty()) {
            System.out.println("Danh sach trong, khong co tai lieu de tim kiem: ");
        } else {
            int choice;
            boolean flag = false;
            do {
                System.out.println("Nhap loai tai lieu can tim: 1. Sach, 2. Tap chi, 3. Bao");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Ket qua tim kiem Sach");
                        break;
                    case 2:
                        System.out.println("Ket qua tim kiem Tap chi");
                        break;
                    case 3:
                        System.out.println("Ket qua tim kiem Bao");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
            } while (choice < 1 || choice > 3);

            for (Tailieu tl : List) {
                if ((choice == 1 && tl instanceof Sach) ||
                        (choice == 2 && tl instanceof Tapchi) ||
                        (choice == 3 && tl instanceof Bao)) {
                    System.out.println(tl);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Khong tim thay");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();

        while (true) {
            System.out.println("QUAN LY SACH");
            System.out.println("1. Nhap thong tin tai lieu");
            System.out.println("2. Thong tin tai lieu");
            System.out.println("3. Tim kiem tai lieu theo loai");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    qls.Add();
                    break;
                case 2:
                    qls.Display();
                    break;
                case 3:
                    qls.Search();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    sc.close();
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }
}