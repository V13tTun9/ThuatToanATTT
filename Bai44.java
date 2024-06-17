package ThuatToanTrongATTT.BaiTapTH;

import java.util.Arrays;
import java.util.Scanner;


public class Bai44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang A: ");
        int n = sc.nextInt(); 
        int[] MangA = new int[n];
        int[] MangB = new int[n];
        System.out.print("Nhap mang A: ");
        for(int i = 0; i < n; i++){
            MangA[i] = sc.nextInt();
        }
        System.out.print("Nhap vao truong so p: ");
        int p = sc.nextInt();
     
        System.out.println(Arrays.toString(MangA));
        for(int i = 0; i < n; i++){
            MangB[i] = Euclide(MangA[i], p);
        }
        System.out.println("Cac phan tu cua Mang B la: "+Arrays.toString(MangB));
    }
    
    public static int Euclide(int a, int p){
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
