
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so N : ");
        int N = scanner.nextInt();
        int t = 0;
        Sang(N, t);
        
    }
    
    // sang eratosthenes
    private static void Sang(int a, int b){
        boolean[] Prime = new boolean[a+1];
        for(int i = 1; i <= a; i++){
            Prime[i] = true;
            Prime[0] = Prime[1] = false;
        }
        for(int i = 2; i <= Math.sqrt(a); i++){
            for(int j = i*i; j <= a; j += i){
                Prime[j] = false;
            }
        }
        for(int i = 1; i <= a; i++){
            if(Prime[i] == true){
                b++;
            }
        }
        System.out.println(" Tong so nguyen to nho hon N la: "+b);        
    }
}
