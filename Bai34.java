
package ThuatToanTrongATTT.BaiTapTH;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so N: ");
        int N = sc.nextInt();
        System.out.print("Nhap tham so an toan t = ");
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.print("Chon 1 so nguyen a bat ki, a thuoc [2,n-2]: ");
            int a = sc.nextInt();
            double b = NhanBinhPhuongCoLap(a, N - 1, N);
            System.out.println(" " + b);
            if (b != 1) {
                System.out.println("Hop so !!");
            } else {
                System.out.println("Nguyen to !!!");
            }
        }
    }

    public static double NhanBinhPhuongCoLap(double a, double k, double N) {
        ArrayList<Double> bin = new ArrayList<>();
        double b = 1;
        double A = a;
        while (k > 0) {
            bin.add(k % 2);
            k = Math.floor(k / 2);
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
