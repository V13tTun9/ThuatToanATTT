
package ThuatToanTrongATTT.BaiTapTH;

import ThuatToanTrongATTT.Sang_Eratosthenes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import ThuatToanTrongATTT.ThuatToanMiller_Rabin;
import java.util.List;


public class Bai45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();        
        System.out.print("Nhap so phan tu cua mang A: ");
        int n = sc.nextInt();
        int[] MangA = new int[n];
        ArrayList<Integer> Mang = new ArrayList<>();

        for(int i = 1; i <= 100; i++){

                Mang.add(i);

        }
        int rdIndex1;
        for(int i = 0; i < n; i++){
            do{
            rdIndex1 = rd.nextInt(Mang.size());
            }
            while(ThuatToanMiller_Rabin.Miller_Rabin(Mang.get(rdIndex1), Mang.get(rdIndex1)-2) == false);
                MangA[i] = Mang.get(rdIndex1);
                
            
        }
        System.out.println(Arrays.toString(MangA));
        int k = 0;
        int[] KhoangCach = new int[n * (n-1)];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(MangA[i] != MangA[j]){
                int d = Math.abs(MangA[i] - MangA[j]);
                KhoangCach[k] = d;
                k++;
                }
                
            }
        }
        Arrays.sort(KhoangCach);
        System.out.println("Khoang cach nhat giua hai so bat ki trong mang la: "+KhoangCach[0]);
    }
}
