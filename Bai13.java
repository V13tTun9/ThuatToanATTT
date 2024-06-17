
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;


public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        int N = scanner.nextInt();
        boolean[] Prime = new boolean[1000001];
        for(int i = 0; i <= N; i++){
            Prime[i] = true;
            Prime[0] = Prime[1] = false;
        }
        for(int i = 2; i <= Math.sqrt(N); i++){
            for(int j = i*i; j <= N; j += i){
                Prime[j] = false;
            }
        }
        System.out.println("Cap so can tim la :");
        for(int i = 0; i <= N; i++){
            if(Prime[i] == true){
                int tong = 2 + i;
                int hieu = i - 2;
                if(Prime[tong] && Prime[hieu]){
                    System.out.println("2 va "+i);
                }
            }
        }
        
    }
    
}
