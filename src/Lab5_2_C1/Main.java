package Lab5_2_C1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<PS> list = new ArrayList<>();

        System.out.print("Nhap so PS: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("PS " + (i + 1) + ": ");
            System.out.print("Nhap TS: ");
            int TS = sc.nextInt();
            int MS;
            do {
                System.out.print("Nhap MS: ");
                MS = sc.nextInt();
            } while (MS == 0);
            list.add(new PS(TS,MS));
        }

        for(PS p : list) {
            p.Display();
        }
    }
}
