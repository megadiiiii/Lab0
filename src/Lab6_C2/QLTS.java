package Lab6_C2;

import java.util.Scanner;
import java.util.ArrayList;

public class QLTS {
    Scanner sc = new Scanner(System.in);
    ArrayList<Thisinh> list = new ArrayList<>();

    public void addThisinh() {
        int choice;
        Thisinh TS = null;
        do {
            System.out.println("Nhap khoi thi: 1. Khoi A, 2. Khoi B, 3. Khoi C");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    TS = new KhoiA();
                    break;
                case 2:
                    TS = new KhoiB();
                    break;
                case 3:
                    TS = new KhoiC();
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
            }
        } while (TS == null);

        TS.input(sc);
        list.add(TS);
    }

    public void Display() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            System.out.println("DANH SACH THI SINH");
            for (Thisinh TS : list) {
                System.out.println(TS);
            }
        }
    }

    public void Search() {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong, khong co de tim kiem");
        } else {
            System.out.print("Nhap SBD can tim: ");
            int search = sc.nextInt();
            sc.nextLine();
            boolean flag = false;

            System.out.println("KET QUA TIM KIEM");
            for (Thisinh TS : list) {
                if (TS.getId() == search) {
                    System.out.println(TS);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Khong tim thay thi sinh co SBD: " + search);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTS ql = new QLTS();


        while (true) {
            System.out.println("QUAN LY THI SINH");
            System.out.println("1. Nhap thong tin thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem thong tin thi sinh theo SBD");
            System.out.println("4. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ql.addThisinh();
                    break;
                case 2:
                    ql.Display();
                    break;
                case 3:
                    ql.Search();
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai");
                    break;
            }
        }
    }
}
