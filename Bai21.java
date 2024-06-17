package ThuatToanTrongATTT.BaiTapTH;

import ThuatToanTrongATTT.Sang_Eratosthenes;

import java.util.Scanner;

public class Bai21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 2 so A va B: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count1 = 0, count2 = 0;
        boolean[] Prime = new boolean[1000001];
        for (int i = A; i <= B; i++) {
            Sang_Eratosthenes.SangNguyenThuy(i, Prime);
            for (int j = 1; j < i; j++) {
                if (Prime[j]) {
                    count1++;
                }
            }
            //System.out.println(" "+count1);
            if (Prime[count1]) {
                count2++;

            }
            count1 = 0;
        }
        System.out.println("So luong cac sieu so nguyen to trong khoang [A,B] la: " + count2);
    }
}
