//Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2.
//Hãy viết chương trình tìm số Fibonacci thứ n

import java.util.Scanner;
public class lab0_b9 {
    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        int result = fibonacci(n);
        System.out.println(result);
    }
}