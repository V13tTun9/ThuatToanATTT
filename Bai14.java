package ThuatToanTrongATTT.BaiTapTH;

public class Bai14 {

    public static void main(String[] args) {
        int b;
        // Thuật toán sàng số nguyên tố Eratosthenes
        boolean[] Prime = new boolean[1000001];
        for (int i = 100; i <= 999; i++) {
            Prime[i - 100] = true;
        }
        for (int i = 2; i <= Math.sqrt(999); i++) {
            for (int j = Math.max(i * i, (100 + i - 1) / i * i); j <= 999; j += i) {
                Prime[j - 100] = false;
            }
        }
        for (int i = 100; i <= 999; i++) {
            if (Prime[i - 100] == true) {
                b = daoNguocSo(i);
                if (LapPhuong(b)) {
                    System.out.println("So can tim la: " + i);
                }
            }
        }

    }
    // Hàm này để đảo ngược số
    private static int daoNguocSo(int a) {
        int soDaoNguoc = 0;
        while (a > 0) {
            int soCuoi = a % 10;
            soDaoNguoc = soDaoNguoc * 10 + soCuoi;
            a = a / 10;
        }
        return soDaoNguoc;
    }
    // Hàm này để kiểm tra xem số có bằng lập phương của 1 số tự nhiên nào không
    private static boolean LapPhuong(int b) {
        for (int i = 1; i <= b; i++) {
            if (b == Math.pow(i, 3)) {
                return true;
            }
        }
        return false;
    }
}
