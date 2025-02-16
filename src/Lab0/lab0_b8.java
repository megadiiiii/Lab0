//Viết chương trình tính tổng S = 1 /1! + 2 /2! + ....+ n / n

import java.util.Scanner;
public class lab0_b8 {
    public static int factorical(int n) {
        if(n == 1) return 1;
        return n * factorical(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += (double) i/factorical(i);
        }
        System.out.println(sum);
    }
}