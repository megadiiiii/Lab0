//Tạo lớp phân số ps có hai thuộc tính là tử và mẫu
//a. Xây dựng hai hàm khởi tạo có tham số khác nhau
//b. Xây dựng các phương thức cộng, trừ, nhân, chia phân số

public class ps {
    private int ts = 1, ms = 1;

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

    public void display() {
        System.out.println(ts + "/" + ms);
    }

    public ps add(ps p) {
        ps result = new ps();
        result.ts = this.ts * p.ms + p.ts * p.ms;
        result.ms = this.ms * p.ms;
        result.rg();
        return result;
    }

    public ps sub(ps p) {
        ps result = new ps();
        result.ts = this.ts * p.ms - p.ts * p.ms;
        result.rg();result.ms = this.ms * p.ms;
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

    public void rg() {
        int a = Math.abs(ts), b = Math.abs(ms);
        while(a != b) {
            if(a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        ts /= a;
        ms /= a;
    }

    public static void main(String[] args) {
        ps p1 = new ps(3,6);
        ps p2 = new ps(3,8);

        ps sum  = p1.add(p2);
        sum.display();
    }
}