package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;

public class Bai03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int N = scanner.nextInt();
        boolean[] Prime = new boolean[N+1];
        int k = 0, p = 0, s = 0, q = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                p += i;
                s++;
            }
        }
        for (int j = 2; j <= N; j++) {
            Sang_Eratosthenes.SangNguyenThuy(N, Prime);
            if (N % j == 0 && Prime[j]) {
                q += j;
                k++;
            }
        }
        int t = N + p + s - q - k;
        System.out.println("ta co tong la " + t);
    }
}
