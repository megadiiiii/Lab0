//Cho ma trận số nguyên cấp n x m. Cài đặt các hàm thực hiện các chức năng sau:
//a) Nhập ma trận.
//b) In ma trận.
//c) Tìm phần tử nhỏ nhất.
//d) Tìm phần tử lẻ lớn nhất.
//e) Tìm dòng có tổng lớn nhất

import java.util.Scanner;
public class lab0_b13 {
    public static void input(int n, int m, int arr[][]) {
    Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void display(int n, int m, int arr[][]) {
        System.out.println("Ma tran vua nhap:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void minValue(int n, int m ,int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu nho nhat = " + min);
    }

    public static void maxOdd(int n, int m ,int[][] arr) {
        int maxOdd = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 2 != 0 && arr[i][j] > maxOdd) {
                    maxOdd = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu le lon nhat = " + maxOdd);
    }

//    Tìm dòng có tổng lớn nhất
    public static void maxRowSum(int n, int m ,int[][] arr) {
        int maxSum = 0, maxRow = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum || i == 0) {
                maxSum = sum;
                maxRow = i + 1;
            }
        }
        System.out.println("Dong co tong lon nhat: " + maxRow + " (Tong = " + maxSum + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        input(n, m, arr);
        display(n, m, arr);
        minValue(n, m, arr);
        maxOdd(n, m, arr);
        maxRowSum(n, m, arr);
    }
}