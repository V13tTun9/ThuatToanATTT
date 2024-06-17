package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;

public class Bai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vap 2 so nguyen A va B: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        boolean[] Prime = new boolean[1000001];
        Sang_Eratosthenes.Sangtrendoan(A, B, Prime);
        for (int i = A; i <= B; i++) {
            if (Prime[i - A]) {
                count = count + i;
            }
        }
        System.out.println(" " + count);
        if (Primecheck(count)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    public static boolean Primecheck(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
