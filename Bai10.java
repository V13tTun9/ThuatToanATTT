
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import javax.swing.JTable;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vap so N: ");
        int N = scanner.nextInt();
        int t = 0, x = 0;
        //Dùng thuật toán sàng Eratosthenes
        boolean[] Prime = new boolean[N+1];
        for(int i = 1; i <= N; i++){
            Prime[i] = true;
            Prime[0] = Prime[1] = false;
        }
        for(int i = 2; i <= Math.sqrt(N); i++){
            for(int j = i*i; j <= N; j += i){
                Prime[j] = false;
            }
        }        
        timUoc(N, t, Prime, x);
    }    
    
    // Thuật toán tìm số ước 
    private static void timUoc(int a, int t, boolean[] Prime, int x){
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                t++;
                if(Prime[i] == true){
                    x++;
                }
            }
        }
        System.out.println("So uoc cua so N la: "+t);
        System.out.println("So uoc nguyen to cua N la: "+x);
    }
    
}
