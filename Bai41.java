
package ThuatToanTrongATTT.BaiTapTH;

import java.util.ArrayList;
import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;


public class Bai41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, k, n;
        do{
            System.out.print("Nhap vao so nguyen duong n: ");
            n = sc.nextInt();
        } while(n <= 0 || n >= 1000);
        do{
            System.out.print("Nhap vao so nguyen duong a: ");
            a = sc.nextInt();
        } while(a <= 0 || a >= n);
        do{
            System.out.print("Nhap vao so nguyen duong k: ");
            k = sc.nextInt();
        } while(k <= 0 || k >= n);
        
        boolean[] Prime = new boolean[1000001];
        Sang_Eratosthenes.SangNguyenThuy(n, Prime);
        double kq = NhanBinhPhuongCoLap(a, k, n);
        System.out.println((int)kq);
        if(Prime[(int)kq]){
            System.out.println("a^k mod n la so Nguyen To");
        } else{
            System.out.println("a^k mod n khong la so Nguyen To");
        }
    }
    
    //Thuật toán nhân bình phương có lặp
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
