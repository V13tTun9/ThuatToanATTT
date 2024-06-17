
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Arrays;
import java.util.Scanner;


public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so p: ");
        int p = sc.nextInt();
        System.out.print("Nhap vao so w: ");
        int w = sc.nextInt();
        int m = (int)Math.ceil(Math.log(p)/Math.log(2));
        System.out.println(m);
        int t = (int)Math.ceil(m*Math.pow(w, -1));
        System.out.println(t);
        System.out.print("Nhap so A: ");
        int A = sc.nextInt();
        System.out.print("Nhap so B: ");
        int B = sc.nextInt();
        int c = A + B;
        int[] Mang = new int[t];
        Mang = Mang(c, t, w);
        System.out.println("Dang so nguyen la: "+So(Mang, t, w));
        reverse(t, Mang);
        System.out.println(" Dang mang la: "+Arrays.toString(Mang));                
    }
    //Hàm chuyển số thành mảng
    public static int[] Mang(int a, int t, int w) {
        int[] soNguyen = new int[t];
        for (int i = t; i > 0; i--) {
            int b = ((i - 1) * w);
            double c = a / Math.pow(2, b);
            a = a - (int) c * (int) Math.pow(2, b);
            soNguyen[i - 1] = (int) c;
        }
        return soNguyen;
    }
    //Hàm chuyển mảng thành số
    public static int So(int[] c, int t, int w) {
        int a = 0;
        for (int i = t ; i > 0; i--) {
            int b = ((i-1) * w);
            a = a + c[i-1] * (int) Math.pow(2, b);
        }
        return a;
    }
    //Hàm để đảo ngược mảng
    static void reverse(int t, int[] array) {
        int left = 0, right = t - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
