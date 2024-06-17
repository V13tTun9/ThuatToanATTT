
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Arrays;
import java.util.Scanner;


public class Bai37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi T: ");
        String T = sc.nextLine();
        System.out.print("Nhap vao chuoi P: ");
        String P = sc.nextLine();
        int[] Table = T(P);
        System.out.println("Ta co bang so sanh: "+Arrays.toString(Table));
        int kq = KMP(T, P);
        if(kq == 1){
            System.out.println("Khong co chuoi P trong T !!!");
        } else{
            System.out.println("Chuoi P nam o vi tri thu: "+kq);
        }
    }
    
    public static int[] T(String P){
        int i = 0, j = 1;
        int[] T = new int[P.length()];
        Arrays.fill(T, 0);
        while(j < P.length()){
            if(P.charAt(i) == P.charAt(j)){
                i++;
                T[j] = i;
                j++;
            } else{
                if(i != 0){
                    i = T[i-1];
                } else{
                    T[j] = i;
                    j++;
                }
            }
        }
        return T;
    }
    
    public static int KMP(String Str, String P){
        int i = 0, j = 0;
        int[] T = T(P);
        while(i < Str.length()){
            if(Str.charAt(i) == P.charAt(j)){
                if(j == P.length()-1){
                    return i - j;
                }
                i++;
                j++;
            } else{
                if(j != 0){
                    j = T[j - 1];
                } else{
                    i++;
                }
            }
        }
        return 1;
    }
}
