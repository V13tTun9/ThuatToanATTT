

package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;


public class Bai38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen to p: ");
        int p = sc.nextInt();
        System.out.print("Nhap vao so a (1<a<p-1): ");
        int a = sc.nextInt();
        int kq = Euclide(p, a);
        System.out.println("Nghich dao cua a mod p = "+kq);
        
    }
    
    public static int Euclide(int p, int a){
        int p1 = p;
        int x1 = 1;
        int x2 = 0;
        while(a != 1){
            int q = p/a;
            int r = p - q*a;
            int x = x2 - q*x1;
            p = a;
            a = r;
            x2 = x1;
            x1 = x;
        }
        if(x1 < 0){
            x1 = x1 + p1;
        }
        return x1;
    }
    
}
