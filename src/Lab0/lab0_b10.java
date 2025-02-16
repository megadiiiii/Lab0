//Bài 10. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.

import java.util.Scanner;
public class lab0_b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum: " + sum);
    }
}