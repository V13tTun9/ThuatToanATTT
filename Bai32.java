
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Random;
import ThuatToanTrongATTT.Sang_Eratosthenes;
import java.util.ArrayList;
import java.util.Scanner;
import ThuatToanTrongATTT.EuclideMoRong;

public class Bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Integer> Mang = new ArrayList<>();
        ArrayList<Integer> uoc = new ArrayList<>();
        boolean[] Prime = new boolean[500-100+1];
        
        //Áp dụng sàng trên đoạn để tìm các số nguyên tố trong 100 đến 500
        Sang_Eratosthenes.Sangtrendoan(101, 499, Prime);
        for(int i = 101; i <= 499; i++){
            if(Prime[i-101]){
                Mang.add(i);
            }
        }
        
        //Này là chọn ngẫu nhiên số nguyên tố từ 100 đên 500
        int rdIndex1 = rd.nextInt(Mang.size());
        int p = Mang.get(rdIndex1);
        int rdIndex2 = rd.nextInt(Mang.size());
        int q = Mang.get(rdIndex2);
        int n = q*p;
        int pn = (q-1)*(p-1);
        System.out.println(pn);
        for(int i = 2; i <= pn; i++){
            if(gcd(pn, i) == 1){
                uoc.add(i);
            }   
        }
        //Chọn ngẫu nhiên 1 số e sao cho e với pn là 2 số nguyên tố cùng nhau
        int rdIndex3 = rd.nextInt(uoc.size());
        int e = uoc.get(rdIndex3);
        System.out.println(e);
        
        //Áp dụng Euclide mở rộng để tính nghịch đảo của modulo  (e^-1 mod pn)
        int d = EuclideMoRong.EuclideMoRong(pn, e);
        System.out.println("e^-1 mod pd = "+d);
        System.out.print("Nhap SBD: ");
        int SBD = sc.nextInt();
        double m = SBD + 123; 
        //Áp dụng thuật toán nhân bình phương có lặp để tính m^e mod n
        double c = NhanBinhPhuongCoLap(m, e, n);
        System.out.println("Ban ma cua thong diep la: "+(int)c);
        
        m = NhanBinhPhuongCoLap(c, d, n);
        System.out.println("Giai ma thong diep: "+(int)m);
        
    }
    
    public static int gcd(int a, int b){
       int R;
        while(b > 0){
            R = a % b;
            a = b;
            b = R;
        }
        return a;
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
