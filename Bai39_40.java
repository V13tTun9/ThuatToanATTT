
package ThuatToanTrongATTT.BaiTapTH;

import ThuatToanTrongATTT.Sang_Eratosthenes;
import java.util.Arrays;
import java.util.Scanner;


public class Bai39_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Nhap kich thuoc cua mang A: ");
        int n = sc.nextInt();
        int[] MangA = new int[n];
        System.out.print("Nhap mang A: ");
        for(int i = 0; i < n; i++){
            MangA[i] = sc.nextInt();
        }
        Arrays.sort(MangA);
        boolean[] Prime = new boolean[MangA[n-1]+1];
        Sang_Eratosthenes.SangNguyenThuy(MangA[n-1], Prime);
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(Prime[gcd(MangA[i], MangA[j])]){
                    count++;
                    System.out.println(MangA[i]+" "+MangA[j]);
                    System.out.println("UCLN la: "+gcd(MangA[i], MangA[j]));
                }
            }
        }
        System.out.println("So cap thoa man de bai la: "+count);
        
        
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
