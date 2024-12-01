package btvn4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chuỗi kiểm tra sđt: ");
        String sdt = sc.nextLine();
        if(isValidPhoneNumber(sdt)){
            System.out.println("Là số điện thoại");
        }else System.out.println("Không phải số điện thoại");
    }

    private static boolean isValidPhoneNumber(String sdt) {
        String boDauGach = sdt.replaceAll("[\\.\\-]","");

        if(boDauGach.matches("^0\\d{9}$") ||
                boDauGach.matches("^\\+84\\d{9}$") ||
                boDauGach.matches("^84\\d{9}$")) return true;
        return false;
    }
}
