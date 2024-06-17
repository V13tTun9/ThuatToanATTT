
package ThuatToanTrongATTT.BaiTapTH;

import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        
        // Sang eratosthenes de tim ra so nguyen to
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
       boolean[] Prime = new boolean[N];
       for(int i = 0; i < N; i++){
           Prime[i] = true;
           Prime[0] = Prime[1] = false;
       }
       
       for(int i = 2; i < Math.sqrt(N); i++){
           for(int j = i*i; j < N; j += i){
               Prime[j] = false;    
           }
       }
       
       // neu q bằng căn i là 1 số nguyên tố và q*q = i thì i chính là số t_prime
       System.out.println("cac so T-prime la :");
        for(int i = 1; i <= N; i++){
            int q = (int)Math.sqrt(i);
            if(Prime[q] && q*q == i){
                System.out.println(" " +i);
            }
        }
    }
    
//        public static boolean Sang(int N){
//       boolean[] Prime = new boolean[N];
//       for(int i = 0; i < N; i++){
//           Prime[i] = true;
//           Prime[0] = Prime[1] = false;
//       }
//       
//       for(int i = 2; i < Math.sqrt(N); i++){
//           for(int j = i*i; j < N; j += i){
//               Prime[j] = false;    
//           }
//       }
//    } 
}
 