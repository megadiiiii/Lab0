//Viết các hàm sau và kiểm tra kết quả trong phương thức main
//a. Viết hàm tìm ước số chung lớn nhất của 2 số nguyên a và b
//b. Viết hàm tính fibonaci (int n)

import java.util.Scanner;

public class Lab2_b2 {
    public static void ucln(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("UCLN la: " + a);
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        ucln(a, b);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        fibonacci(n);
        int result = fibonacci(n);
        System.out.println("So hang thu " + n + " la: " + result);
    }
}
