
package ThuatToanTrongATTT.BaiTapTH;

import java.util.ArrayList;
import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;


public class Bai43{
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhap vao so nguyen N: ");
        N = sc.nextInt();
        } while(N <= 0 || N >= 1000);
        System.out.print("Nhap vao so P: ");
        int p = sc.nextInt();
        boolean[] Prime = new boolean[N+1];
        Sang_Eratosthenes.SangNguyenThuy(N, Prime);
        for(int a = 1; a < N; a++){
            double kq = NhanBinhPhuongCoLap(a, p, N);
            if(Prime[(int)kq]){
                System.out.println(a);
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
