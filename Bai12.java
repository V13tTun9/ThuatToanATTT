
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;


public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so vao so N: ");
        int N = scanner.nextInt();
        int a = 0, k = 0;
        int[] index = new int[N+1];
        boolean[] Prime = new boolean[1000001];
        for(int i = 0; i <= N; i++){
            Prime[i] = true;
            Prime[0] = Prime[1] = false;
        }
        for(int i = 2; i <= Math.sqrt(N); i++){
            for(int j = i*i; j <= N; j += i){
                Prime[j] = false;
            }
        }
        for(int i = 0; i <= N; i++){
            if(Prime[i] == true){
                a++;
                index[k] = i;
                System.out.print("Cac so Nguyen to nho hon N la: "+ index[k]);
                k++;
                
            }
            
        }System.out.println("So so Nguyen to nho hon N la: "+a);
        for(k = 0; k < a-3; k++){
            int c = index[k] + index[k+1] + index[k+2] + index[k+3];
            if(Prime[c] == true && c <= N){
                System.out.println("4 so Nguyen to can tim la: "+ index[k] +" "+ index[k+1] +" "+ index[k+2] +" "+ index[k+3]);
            }
        }
    }
}
