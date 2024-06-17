package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai06 {

    public static int tinhTongUocSo(int a) {
        int b = 1;
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                b += i;
                if (i != a / i) {
                    b += a / i;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        int N = scanner.nextInt();
        System.out.println("Cac cap so than thiet la: ");
        for (int k = 1; k < N; k++) {
            int x = tinhTongUocSo(k);
            if (x < k) {
                if (tinhTongUocSo(x) == k) {
                    System.out.println(x + " " + k);
                }
            }
        }

    }
}
