
package ThuatToanTrongATTT.BaiTapTH;

import java.util.ArrayList;
import java.util.Scanner;


public class Bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        int N = sc.nextInt();
        System.out.print("Nhap vao tham so an toan t: ");
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.print("Nhap so nguyen a bat ki, a thuoc [2,n-2]: ");
            int a = sc.nextInt();
            if(Miller_Rabin(N, a)){
                System.out.println("Nguyen to");
            } else{
            System.out.println("Hop so");
            }
        }

    }
    
    public static boolean Miller_Rabin(int N, int a){
        if(N % 2 == 0){
            return false;
        }
        int s = 0;
        int r = (N - 1);
        do {
            r = r / 2;
            s++;
        } while (r % 2 == 0);
        
            double y = NhanBinhPhuongCoLap(a, r, N);
            if (y != 1 && y != N - 1) {
                int j = 1;
                while (j <= s - 1 && y != N - 1) {
                    y = NhanBinhPhuongCoLap(y, 2, N);
                    if (y == 1) {
                        return false;
                    }
                    j++;
                }
            return y == N - 1;
            } 
        
        return true;
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
