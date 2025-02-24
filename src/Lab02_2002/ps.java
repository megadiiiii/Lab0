//Tạo lớp phân số ps có hai thuộc tính là tử và mẫu
//a. Xây dựng hai hàm khởi tạo có tham số khác nhau
//b. Xây dựng các phương thức cộng, trừ, nhân, chia phân số
import java.util.Scanner;

public class ps {
    private int ts, ms;

    public ps () {
        this.ts = 0;
        this.ms = 1;
    }

    public ps (int ts, int ms) {
        this.ts = ts;
        if(ms == 0) {
            System.out.print("MS khong the bang 0, da dat MS bang 1");
            this.ts = 1;
        } else this.ms = ms;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập TS: ");
        this.ts = sc.nextInt();
        do {
            System.out.print("Nhập MS: ");
            this.ms = sc.nextInt();
            if (this.ms == 0) System.out.println("MS phai khac 0!");
        } while (this.ms == 0);
        rg();
    }

    public void display() {
        System.out.println(ts + "/" + ms);
    }

    public ps add(ps p) {
        ps result = new ps();
        result.ts = this.ts * p.ms + p.ts * this.ms;
        result.ms = this.ms * p.ms;
        result.rg();
        return result;
    }

    public ps sub(ps p) {
        ps result = new ps();
        result.ts = this.ts * p.ms - p.ts * this.ms;
        result.ms = this.ms * p.ms;
        result.rg();
        return result;
    }

    public ps mul(ps p) {
        ps result = new ps();
        result.ts = this.ts * p.ts;
        result.ms = this.ms * p.ms;
        result.rg();
        return result;
    }

    public ps div(ps p) {
        ps result = new ps();
        result.ts = this.ts * p.ms;
        result.ms = this.ms * p.ts;
        result.rg();
        return result;
    }

    public void rg() {
        int a = Math.abs(ts), b = Math.abs(ms);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        ts /= a;
        ms /= a;

        if (ms < 0) {
            ts = -ts;
            ms = -ms;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ps p1 = new ps();
        System.out.println("Nhap PS1: ");
        p1.input();
        ps p2 = new ps();
        System.out.println("Nhap PS2: ");
        p2.input();


        System.out.print("a = ");
        p1.display();
        System.out.print("b = ");
        p2.display();
        System.out.print("a + b = ");
        ps sum  = p1.add(p2);
        sum.display();
        System.out.print("a - b = ");
        ps sub = p1.sub(p2);
        sub.display();
        System.out.print("a * b = ");
        ps mul = p1.mul(p2);
        mul.display();
        System.out.print("a / b = ");
        ps div = p1.div(p2);
        div.display();
    }
}