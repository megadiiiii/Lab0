package Lab0;//Viết chương trình nhập vào 2 số và in tổng, hiệu, tích, thương 2 số đó ra màn hình.
import java.util.Scanner;

public class lab0_b1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }
}