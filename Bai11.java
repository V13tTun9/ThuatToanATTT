
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;


public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so N: ");
        int N = scanner.nextInt();
        int a = 0;
        //Thuật toán sàng Eratosthenes
        boolean[] Prime = new boolean[N+1];
        for(int i = 0; i <= N; i++){
            Prime[i] = true;
            Prime[0] = Prime[1] = false;
        }
        for(int i = 2; i <= Math.sqrt(N); i++){
            for(int j = i*i; j <= N; j+= i){
                Prime[j] = false;
            }
        }
        for(int i = 0; i <= N; i++){
            if(Prime[i] == true){
                a += i;
            }
        }
        System.out.println("Tong ca so Nguyen to be hon N la : " +a);
    }
}
