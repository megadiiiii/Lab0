//Viết chương trình tính n! với n là số nguyên dương được nhập từ bàn phím.
//import java.util.Scanner;

import java.util.Scanner;
public class lab0_b7 {
    public static int factorial (int n) {
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("n! = " + factorial(n));
    }
}