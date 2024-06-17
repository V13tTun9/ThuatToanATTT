package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai16 {

    public static void main(String[] args) {
        int c = 1000001;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] Mang = new int[N];
        for (int i = 0; i < N; i++) {
            Mang[i] = scanner.nextInt();
        }
        boolean[] Prime = new boolean[c];
        for (int i = 0; i < N; i++) {
            Prime[Mang[i]] = true;
            if (Mang[i] == 0 || Mang[i] == 1) {
                Prime[Mang[i]] = false;
            }
        }
        for (int k = 0; k < N; k++) {
            for (int i = 2; i <= Math.sqrt(c); i++) {
                for (int j = i * i; j <= c; j += i) {
                    if (Mang[k] == j) {
                        Prime[Mang[k]] = false;
                    }
                }
            }
        }
        System.out.println("Cac so Nguyen to trong mang la: ");
        for (int i = 0; i < N; i++) {
            if (Prime[Mang[i]] == true) {
                System.out.print(" " + Mang[i] + " ");
            }
        }
    }
}
