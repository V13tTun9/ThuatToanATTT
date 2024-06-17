package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao cap so M va N: ");
        int M = sc.nextInt();
        int N = sc.nextInt();
        System.out.print("Nhap vao so D: ");
        int D = sc.nextInt();
        if (D > N) {
            System.out.println("So D ban nhap vao khong hop le !");
        }
        System.out.println("Cac cap so can tim la: ");
        for (int i = M + 1; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (gcd(i, j) == D) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static int gcd(int a, int b) {
        int R;
        while (b > 0) {
            R = a % b;
            a = b;
            b = R;
        }
        return a;
    }

}
