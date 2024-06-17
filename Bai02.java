
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;
import ThuatToanTrongATTT.Sang_Eratosthenes;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        int a = (int) Math.pow(10, n-1);
        int b = (int) Math.pow(10, n) - 1;
        boolean[] Prime = new boolean[b-a+1];
        System.out.println("Cac so nguyen to >= " + a +" va <= "+ b + " la: ");
        for(int i = a; i <= b; i++){
            Sang_Eratosthenes.Sangtrendoan(a, b, Prime);
                if(Prime[i-a]){
                    x++;
                }           
            if(x == 1){
                System.out.print(" " +i);
            }
            x = 0;
        }
            
    }

    public static void Sangtrendoan(int l, int r, boolean[] Prime) {
           for(int i = 0; i < r - l + 1; i++){
               Prime[i] = true;
           }
           for(int i = 2; i <= Math.sqrt(r); i++){
               for(int j = Math.max(i*i, (l+i-1)/i*i); j <= r; j += i){
                   Prime[j - l] = false;
               }
               if(l == 0){
                   Prime[0] = Prime[1] = false;
               } else if(l == 1){
                   Prime[0] = false;
               }
           }
        }
}
    
    

