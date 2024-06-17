package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;
import java.util.ArrayList;

public class Bai28_29_30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        int N = sc.nextInt();
        boolean[] Prime = new boolean[N + 1];
        Sang_Eratosthenes.SangNguyenThuy(N, Prime);
        System.out.println("So Carmichael la: ");
        for (int i = 1; i <= N; i++) {
            if (Prime[i]) {
                continue;
            }
            for (int b = 2; b <= i; b++) {

                if (gcd(b, i) == 1) {
                    if (NhanBinhPhuongCoLap(b, i - 1, i) != 1) {
                        break;
                    }
                }
                if(b == i){
                System.out.println(i);
                }
            }
        }
    }
    // Hàm để tính UCLN của 2 số
    public static int gcd(int a, int b) {
        int R;
        while (b > 0) {
            R = a % b;
            a = b;
            b = R;
        }
        return a;
    }
    //Hàm nhân bình phương có lặp để tính b^(n-1) mod n
    public static int NhanBinhPhuongCoLap(int a, int k, int N) {
        ArrayList<Integer> bin = new ArrayList<>();
        int b = 1;
        int A = a;
        while (k > 0) {
            bin.add(k % 2);
            k /= 2;
        }
        if (bin.get(0) == 1) {
            b = a;
        }
        for (int i = 1; i < bin.size(); i++) {
            A = (A * A) % N;
            if (bin.get(i) == 1) {
                b = (A * b) % N;
            }
        }
        return b;
    }

}
