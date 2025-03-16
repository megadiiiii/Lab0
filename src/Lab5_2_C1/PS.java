package Lab5_2_C1;
//Câu 1:
//        1>Xay dung lop phan so voi hai thuoc tinh rieng xac dinh tu so va mau
//so cua phan so va xay dung cac Phuong thuc:
//        -Cac toan tu tao lap
//-Cac phep toan cong ,tru ,nhan ,chia cac phan so
//-phep kiem tra mot phan so co phai toi gian hay ko
//-Phep tim dang toi gian cua phan so.
//        2>Viet chuong trinh ung dung thuc hien viec nhap vao mot day cac phan
//so va in ra man hinh dang toi gian cua cac phan so do.
//

import java.util.Scanner;

public class PS {
    private int TS, MS;

    public PS() {
        this.TS = 0;
        this.MS = 1;
    }

    public PS(int TS, int MS) {
        this.TS = TS;
        this.MS = MS;
    }

    public void Input(Scanner sc) {
        System.out.print("Nhap TS: ");
        this.TS = sc.nextInt();
        do {
            System.out.print("Nhap MS: ");
            this.MS = sc.nextInt();
        } while (this.MS == 0);
    }

    public void Display() {
        PS pstg = new PS(TS, MS);
        pstg.RG();
        System.out.println(pstg.TS + "/" + pstg.MS);
    }

    public boolean KTTG() {
        int a = Math.abs(TS), b = Math.abs(MS);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a == 1;
    }

    public void RG() {
        int a = Math.abs(TS), b = Math.abs(MS);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        TS /= a;
        MS /= a;
        if (MS < 0) {
            TS = -TS;
            MS = -MS;
        }
    }

    public PS add(PS p) {
        PS Result = new PS();
        Result.TS = this.TS * p.MS + p.TS * this.MS;
        Result.MS = this.MS * p.MS;
        Result.RG();
        return Result;
    }

    public PS sub(PS p) {
        PS Result = new PS();
        Result.TS = this.TS * p.MS - p.TS * this.MS;
        Result.MS = this.MS * p.MS;
        Result.RG();
        return Result;
    }

    public PS mul(PS p) {
        PS Result = new PS();
        Result.TS = this.TS * p.TS;
        Result.MS = this.MS * p.MS;
        Result.RG();
        return Result;
    }

    public PS div(PS p) {
        PS Result = new PS();
        Result.TS = this.TS * p.MS;
        Result.MS = this.MS * p.TS;
        Result.RG();
        return Result;
    }

    public int getTS() {
        return TS;
    }

    public void setTS(int TS) {
        this.TS = TS;
    }

    public int getMS() {
        return MS;
    }

    public void setMS(int MS) {
        this.MS = MS;
    }
}

