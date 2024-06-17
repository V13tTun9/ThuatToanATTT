
package ThuatToanTrongATTT.BaiTapTH;

import ThuatToanTrongATTT.Sang_Eratosthenes;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Bai42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Integer> Mang = new ArrayList<>();
        boolean[] Prime = new boolean[1001];
        
        //Áp dụng sàng trên đoạn để tìm các số nguyên tố trong 0 đến 1000
        Sang_Eratosthenes.SangNguyenThuy(1000, Prime);
        for(int i = 1; i <= 999; i++){
            if(Prime[i]){
                Mang.add(i);
            }
        }
        
        //Này là chọn ngẫu nhiên số nguyên tố từ 0 đên 1000
        int rdIndex1 = rd.nextInt(Mang.size());
        int p = Mang.get(rdIndex1);
        int rdIndex2 = rd.nextInt(Mang.size());
        int q = Mang.get(rdIndex2);
        System.out.println(p+" "+q);
        
        for(int a = 1; a < 100; a++){
            double kq = NhanBinhPhuongCoLap(a, p, q);
            if(Prime[(int)kq]){
                System.out.println("So a la: "+a);
                System.out.println("a^p mod q = "+(int)kq);
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
