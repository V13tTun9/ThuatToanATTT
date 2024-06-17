
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;


public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        for(int x = 1; ;x++){
            int kq = A*x*x + B*x + C;
            if(PrimeCheck(kq) && kq > 0){
                System.out.println("So x nho nhat can tim la: "+x);
                break;
            }
        }
    }
    
    private static boolean PrimeCheck(int a){
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0)
                return false;
        }
        return true;
    }
}
