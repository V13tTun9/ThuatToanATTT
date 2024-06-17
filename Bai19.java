
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;


public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so A, B va C: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println("Nhap vao m va l: ");
        int m = scanner.nextInt();
        int l = scanner.nextInt();
        System.out.print("Cac so x can tim la : ");
        for(int x = 1; ;x++){
            int kq = A*x*x + B*x + C;
            if(PrimeCheck(kq) && kq > 0 && x >= m && x <= l){
                System.out.print(" "+x);
                
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

