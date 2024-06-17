package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;

public class Bai24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hai so a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        boolean[] Prime = new boolean[1000001];
        Sang_Eratosthenes.Sangtrendoan(a, b, Prime);
        for (int i = a; i <= b; i++) {
            if (Prime[i - a]) {
                for (int j = 1; j <= Math.sqrt(i); j++) {
                    for (int k = 1; k <= Math.sqrt(i); k++) {
                        if (j * j + k * k == i) {
                            count++;
                            //System.out.println(j+" "+k);
                        }
                    }
                }
            }
        }
        System.out.println(" " + count / 2);
    }
}
