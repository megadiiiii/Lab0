//Viết chương trình tính tổng S = 1 + 2 + 3 + … + n
//với n nguyên dương được nhập từ bàn phím.

import java.util.Scanner;
public class lab0_b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}