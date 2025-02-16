//Viết chương trình kiểm tra xem một số nguyên nhập vào có phải là số nguyên tố

import java.util.Scanner;
public class lab0_b11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Khong la SNT.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("Khong la SNT.");
                    return;
                }
            }
            System.out.println("SNT.");
        }
    }
}