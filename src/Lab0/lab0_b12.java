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

    public static void evenCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Co " + count + " phan tu chan");
    }

    public static void isPrime(int[] arr) {
        System.out.print("Các số nguyên tố: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1) continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void xPosition(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x");
        int x = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Phần tử " + x + " có trong mảng.");
        } else {
            System.out.println("Không tìm thấy phần tử " + x + " trong mảng.");
        }
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
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        maxValue(arr);
        minValue(arr);
        evenCount(arr);
        isPrime(arr);
        sort(arr);
        xPosition(arr);
    }
}