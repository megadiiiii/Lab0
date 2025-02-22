//Bài 14. Viết chương trình nhập vào vào ma trận A có n dòng, m cột,
//các phần tử là những số nguyên lớn hơn 0
//và nhỏ hơn 100 được nhập vào từ bàn phím. Thực hiện các chức năng sau:
//a) Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó.
//b) Tìm và in ra các phần tử là số nguyên tố của ma trận
//(các phần tử không nguyên tố thì thay bằng số 0).
//c) Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần và in kết quả ra màn hình.

import java.util.Scanner;
public class lab0_b14 {
    public static void input(int n, int m, int arr[][]) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = inp.nextInt();
            }
        }
    }

    public static void display(int n, int m, int arr[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void max(int n, int m, int arr[][]) {
        int maxValue = arr[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat la " + maxValue + " tai vi tri [" + maxRow + ", " + maxCol + "]");
    }

    public static void primeDisplay(int n, int m, int arr[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < 2) {
                    arr[i][j] = 0;
                } else {
                    boolean isPrime = true;
                    for (int k = 2; k <= Math.sqrt(arr[i][j]); k++) {
                        if (arr[i][j] % k == 0) {
                            arr[i][j] = 0;
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        arr[i][j] = arr[i][j];
                    }
                }
            }
        }

        System.out.println("Ma tran sau khi thay cac phan tu khong phai so nguyen to thanh 0:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sortCol(int n, int m, int arr[][]) {
        System.out.println("Ma tran sau sap xep theo cot la:");
        for(int j = 0; j < m; j++) {
            for (int i = 0; i < n - 1; i++) {
                for(int k = i + 1; k < n; k++) {
                    if(arr[i][j] > arr[k][j]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = temp;
                    }
                }
            }
        }
        display(n, m, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        input(n, m, arr);
        System.out.println("Ma tran vua nhap la:");
        display(n, m, arr);
        max(n, m, arr);
        primeDisplay(n, m, arr);
        sortCol(n, m, arr);
    }
}