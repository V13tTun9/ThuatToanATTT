package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int x = 0;
        Sang(A, B, x);
    }
// Sàng số nguyên tố

    public static void Sang(int l, int r, int x) {
        boolean[] Prime = new boolean[r - l + 1];
        for (int i = 0; i < r - l + 1; i++) {
            Prime[i] = true;
        }
        for (int i = Math.max(l, 2); i < Math.sqrt(r); i++) {
            for (int j = Math.max(i * i, (l + i - 1) / i * i); j <= r; j += i) {
                Prime[j - l] = false;
            }
            if (l == 0) {
                Prime[0] = Prime[1] = false;
            } else if (l == 1) {
                Prime[0] = false;
            }
        }
        for (int i = l; i <= r; i++) {
            if (Prime[i - l] == true) {
                x += i;
            }
        }
        System.out.println("Tong la : " + x);
    }
}
