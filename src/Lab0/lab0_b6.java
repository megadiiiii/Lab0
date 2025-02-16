//Bài 6. Viết chương trình tính tổng S = 1 + 1/2 + 1/3 + … + 1/n
//với n nguyên dương được nhập từ bàn phím.

import java.util.Scanner;
public class lab0_b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("Sum: " + sum);
    }
}