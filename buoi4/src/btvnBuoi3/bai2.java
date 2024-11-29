package btvnBuoi3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("nhap vao so N:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(doiSangNhiPhan(n));
    }

    private static String doiSangNhiPhan(int n) {
        int temp;
        StringBuilder res = new StringBuilder();
        while(n != 0){
            temp = n % 2;
            res.append(temp);
            n = n / 2;
        }
        return res.toString();
    }
}
