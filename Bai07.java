package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean[] Prime = new boolean[1000001];
        for (int i = 0; i < N; i++) {
            Prime[i] = true;
            Prime[0] = Prime[1] = false;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i * i; j <= N; j += i) {
                Prime[j] = false;
            }
        }
        for (int i = 1; i < N; i++) {
            if (Prime[i] == true) {
                if (soNguyenTo(daoSo(i)) && i != daoSo(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static int daoSo(int N) {
        int soDaoNguoc = 0;
        int chuSoCuoi;
        while (N > 0) {
            chuSoCuoi = N % 10;
            soDaoNguoc = soDaoNguoc * 10 + chuSoCuoi;
            N = N / 10;
        }
        return soDaoNguoc;
    }

    public static boolean soNguyenTo(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
