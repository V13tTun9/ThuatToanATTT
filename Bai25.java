
package ThuatToanTrongATTT.BaiTapTH;

import java.util.List;
import ThuatToanTrongATTT.Sang_Eratos;
import java.util.ArrayList;
import java.util.Scanner;


public class Bai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen N: ");
        int N = sc.nextInt();
        System.out.print("Nhap vao so nguyen M: ");
        int M = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        if(KiemTra(N, M, result)){
            System.out.println("So "+N+" co the phan tich thanh "+M+" so nguyen to la: "+result);
        } else{
            System.out.println("So "+N+" khong the phan tich thanh "+M+" so nguyen to");
        }
        
    }
    
    public static boolean TimTongNguyenTo(List<Integer> primes, int target, int count, int startIndex, List<Integer> result) {
        if (count == 0) {
            return target == 0;
        }
        for (int i = startIndex; i < primes.size(); i++) {
            if (primes.get(i) > target) {
                break;
            }
            result.add(primes.get(i));
            if (TimTongNguyenTo(primes, target - primes.get(i), count - 1, i + 1, result)) {
                return true;
            }
            result.remove(result.size() - 1); // Backtrack
        }
        return false;
    }
     
    public static boolean KiemTra (int N, int M, List<Integer> result){
        if(N < 2 * M){ // Kiẻme tra phải có tối thiểu M số nguyên tố và mỗi số phải lớn hơn hoặc bằng 2
            return false;
        }
        List<Integer> SoNT = Sang_Eratos.SangNguyenThuy(N);
        return TimTongNguyenTo(SoNT, N, M, 0, result);
    }
}
