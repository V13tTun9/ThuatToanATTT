package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;

public class Bai26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        int N = sc.nextInt();
        boolean[] Prime = new boolean[N+1];
        Sang_Eratosthenes.SangNguyenThuy(N, Prime);
        for (int i = 2; i <= N; i++) {
            if (Prime[i]) {

                for (int j = 1;; j++) {
                    if (i * i * j < N) {
                        int c = i * i * j;
                        System.out.println(" " + c);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
