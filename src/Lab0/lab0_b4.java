//Bài 4. Viết chương trình giải phương trình bậc hai. (ax^2 + bx + c = 0)
import java.util.Scanner;
public class lab0_b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();
        int delta = b * b - 4 * a * c;
        if(a == 0) {
            System.out.println("Khong phai phuong trinh bac 2.");
        } else
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b/(2 * a);
                System.out.print("Phuong trinh co nghiem kep = " + x);
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co nghiem x1 = " + x1);
                System.out.println("Phuong trinh co nghiem x2 = " + x2);
            }
    }
}