package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soNguyen;
        int a = 2;
        soNguyen = scanner.nextInt();
        System.out.println("Cac so Q-Prime la :");
        for(int i = 1; i <= soNguyen; i++){
            for(int j = 2; j <= i/2; j++){ //Vì mỗi số đều có ước là 1 và chính nó nên ta giảm bước nhảy
                if(i % j == 0){
                    a++;
                }                
            } 
            if(a == 4){
                System.out.println(i);
            }
            a = 2;
        }
    }
}
