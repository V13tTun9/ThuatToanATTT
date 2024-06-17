
package ThuatToanTrongATTT.BaiTapTH;

import ThuatToanTrongATTT.Sang_Eratosthenes;

public class Bai27 {
    public static void main(String[] args) {
        boolean[] Prime = new boolean[1001];
        System.out.println("Cac cap a va b thoa man la : ");
        for(int i = 2; i <= 1000; i++){
            for(int j = 2; j <= 1000; j++){
                int c = gcd(i, j);
                Sang_Eratosthenes.SangNguyenThuy(i, Prime);
                if(Prime[c] && i != j){
                    System.out.println(i+" "+j);
                }
            }
        }
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
}
