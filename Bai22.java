
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;


public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao hai so L va R: ");
        int L = sc.nextInt();
        int R = sc.nextInt();
        int count = 0;
        boolean[] Prime = new boolean[1000001];
        Sang_Eratosthenes.Sangtrendoan(L, R, Prime);
        for(int i = L; i < R; i++){
            for(int j = i+1; j <= R; j++){
                if(Prime[i-L] && Prime[j-L]){
                    count = count + i*j;
                }
            }
        }
        System.out.print(" Tong cua F(i)*F(j) la: "+count); 
    }
}
