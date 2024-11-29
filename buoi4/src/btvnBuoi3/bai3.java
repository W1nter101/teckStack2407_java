package btvnBuoi3;

import java.util.ArrayList;
import java.util.Scanner;

public class bai3 {


    public static void main(String[] args) {
        System.out.println("Nhập dãy số cần kiểm tra, nếu nhập 1 sẽ kết thúc dãy số: ");
        int n;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            n = sc.nextInt();
            if(n == 1) break;
            list.add(n);
        }
        ArrayList<Integer> perfectList = new ArrayList<>();
        ArrayList<Integer> ArmstrongList = new ArrayList<>();
        ArrayList<Integer> SymmetryList = new ArrayList<>();
        ArrayList<Integer> sumDigits = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(kiemTraHoanHao(list.get(i))) perfectList.add(list.get(i));
            if(kiemTraArmstrong(list.get(i))) ArmstrongList.add(list.get(i));
            if(kiemTraSymmetry(list.get(i))) SymmetryList.add(list.get(i));
            sumDigits.add(sumDigitsFunc(list.get(i)));
        }
        System.out.println("cac so perfect");
        for(int num : perfectList) {
            System.out.println(num);
        }
        System.out.println("cac so armstrong");
        for(int num : ArmstrongList) {
            System.out.println(num);
        }
        System.out.println("cac so symmetry");
        for(int num : SymmetryList) {
            System.out.println(num);
        }
        System.out.println("cac sum digits");
        for(int num : sumDigits) {
            System.out.println(num);
        }
    }

    private static Integer sumDigitsFunc(Integer integer) {
        int sum = 0;
        int temp = 0;
        while (integer > 0) {
            temp = integer % 10;
            sum += temp;
            integer = integer / 10;
        }
        return sum;
    }

    private static boolean kiemTraSymmetry(Integer integer) {
        int n = integer;
        int Symmestry = 0;
        int temp = 0;
        while (n != 0) {
            temp = n % 10;
            Symmestry = Symmestry * 10 + temp;
            n = n / 10;
        }
        return Symmestry == temp;
    }

    private static boolean kiemTraArmstrong(Integer integer) {
        int n = integer;
        int soCacChuSo = 0;
        while(n != 0){
            n = n / 10;
            soCacChuSo++;
        }
        n = integer;
        int chuSo = 0;
        int tong = 0;
        while(n != 0){
            chuSo = n % 10;
            tong += (int) Math.pow(chuSo, soCacChuSo);
            n = n / 10;
        }
        return tong == integer;
    }

    private static boolean kiemTraHoanHao(Integer integer) {
        int sumTemp = 0;
        for(int i = 1; i < integer; i++)
        {
            if(integer % i == 0)
                sumTemp += i;
        }
        return sumTemp == integer;
    }
}
