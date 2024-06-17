
package ThuatToanTrongATTT.BaiTapTH;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Bai36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi T: ");
        String T = sc.nextLine();
        System.out.print("Nhap vao chuoi P: ");
        String P = sc.nextLine();
        System.out.print("Nhap vao chuoi x: ");
        String x = sc.nextLine();
        HashMap<Character, Integer> map = TienXuLy(P, x);
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        int kq = Boyer_Moore(T, P, x);
        if (kq == -1) {
            System.out.println("P khong chua trong T");
        } else {
            System.out.println("Chuoi P nam o vi tri thu " + kq);
        }

    }

    public static HashMap<Character, Integer> TienXuLy(String P, String x) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            map.put(x.charAt(i), -1);
        }
        for (int i = 0; i < P.length(); i++) {
            if (map.containsKey(P.charAt(i))) {
                map.replace(P.charAt(i), i);
            }
        }
        return map;
    }

    public static int Boyer_Moore(String T, String P, String x) {
        int BuocNhay;
        HashMap<Character, Integer> map = TienXuLy(P, x);
        for (int i = 0; i < (T.length() - P.length()); i += BuocNhay) {
            BuocNhay = 0;
            for (int j = P.length() - 1; j >= 0; j--) {
                if (P.charAt(j) != T.charAt(i + j)) {
                    BuocNhay = P.length() - Math.min(j, 1 + map.get(P.charAt(j)));
                    break;
                }
            }
            if (BuocNhay == 0) {
                return i;
            }
        }
        return -1;
    }
}
