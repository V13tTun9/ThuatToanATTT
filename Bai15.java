package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so N: ");
        int N = scanner.nextInt();
        boolean[] Prime = new boolean[N+1];
        for(int i = 0; i <= N; i++){
            Prime[i] = true;
            Prime[0] = Prime[1] = false;
        }
        for(int i = 2; i <= Math.sqrt(N); i++){
            for(int j = i*i; j <= N; j +=i){
                Prime[j] = false;
            }
        }
        System.out.println("Cac cap so can tim la : ");
        for(int i = 0 ; i <= N; i++){
            if(Prime[i] && Prime[i+2]){
                System.out.println(i+" "+(i+2));
            }
        }
    }
}
