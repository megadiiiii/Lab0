//Viết chương trình giải phương trình bậc nhất (ax + b = 0)
import java.util.Scanner;
public class lab0_b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh VSN.");
            } else {
                System.out.print("Phuong trinh vo nghiem.");
            }
        } else {
            // Tinh nghiem x
            double x = -b / a;
            System.out.print("Nghiem cua phuong trinh la: x = " + x);
        }
    }
}
