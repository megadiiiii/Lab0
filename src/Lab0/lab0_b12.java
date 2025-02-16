//Bài 12. Viết chương trình nhập vào một mảng số nguyên có n phần tử
//a) Xuất giá trị các phần tử của mảng.
//b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
//c) Đếm số phần tử là số chẵn
//d) Tìm các phần tử là số nguyên tố.
//e) Sắp xếp mảng tăng dần
//f) Tìm phần tử có giá trị x

import java.util.Scanner;
public class lab0_b12 {
    public static void maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max = " + max);
    }

    public static void minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        maxValue(arr);
        minValue(arr);
    }
}