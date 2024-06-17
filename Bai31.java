
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;
import java.util.ArrayList;


public class Bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien cua ban: "); 
        int sv = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int a, b, k = 0;
        boolean[] Prime = new boolean[sv*2+1];
        Sang_Eratosthenes.SangNguyenThuy(sv*2, Prime);
        for(int i = sv; ;i--){
            count1++;
            if(Prime[i]){
                a = i; 
                break;
            }
        }
        for(int j = sv; ;j++){
            count2++;
            if(Prime[j]){
                b = j;
                break;
            }
        }
        
        if(count1 > count2){
            k = b;
            System.out.println("So nguyen to k gan nhat la: "+k);
        }else if(count1 < count2 || count1 == count2){
            k = a;
            System.out.println("So nguyen to k gan nhat la: "+k);
        }
        System.out.print("Nhap so bao danh cua ban: ");
        int SBD = sc.nextInt();
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        System.out.println("a^k mod N = "+NhanBinhPhuongCoLap(a, k, n));
    }
    
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
        if(b < 0){
            b = b + N;
        }
        return b;
    }
}
