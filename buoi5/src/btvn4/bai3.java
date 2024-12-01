package btvn4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập vào các số, nếu nhập -1 sẽ kết thúc: ");
        ArrayList<Integer> list = new ArrayList<>();
        int n;
        while(true) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if(n == -1) break;
            list.add(n);
        }
        for(int i : list){
            System.out.println(i);
        }
        //in ra tổng chẵn và lẻ
        sumOddEven(list);
        //in ra các số nguyên tố
        ArrayList<Integer> soNguyenTo = timSoNguyenTo(list);
        System.out.println("các số nguyên tố: "+soNguyenTo);
        //phần tử chẵn giảm dần, lẻ tăng dần
        oddEvenSort(list);
        //chia làm 2 mảng, 1 màng <= trung bình, 1 bảng lớn hơn
        ArrayList<ArrayList<Integer>> chiaHaiMang = tachMang(list);
        System.out.println("Các số bằng hoặc dưới trung bình: " + chiaHaiMang.get(0));
        System.out.println("Các số trên tủng bình: " + chiaHaiMang.get(1));
        //phần tử trùng lặp
        duplicate(list);

    }

    private static void duplicate(ArrayList<Integer> list) {
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        for(int i : list){
            if(number.contains(i))
            {
                int index = number.indexOf(i);
                counts.set(index, counts.get(index)+ 1);
            }else {
                number.add(i);
                counts.add(1);
            }
        }
        for(int i : list)
        {
            System.out.println("Số " + i + "xuất hiện " + counts.get(i) + "lần ");
        }
    }

    private static ArrayList<ArrayList<Integer>> tachMang(ArrayList<Integer> list) {
        ArrayList<Integer> trungBinh = new ArrayList<>();
        ArrayList<Integer> trenTrungBinh = new ArrayList<>();
        int sum = 0;
        for(int i : list){
            sum += list.get(i);
        }
        double avg = (double) sum / list.size();
        for(int i : list){
            if(list.get(i) > avg){
                trenTrungBinh.add(list.get(i));
            }
            else {
                trungBinh.add(list.get(i));
            }
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.add(trungBinh);
        res.add(trenTrungBinh);
        return res;
    }

    private static void oddEvenSort(ArrayList<Integer> list) {
       ArrayList<Integer> odd = new ArrayList<>();
       ArrayList<Integer> even = new ArrayList<>();
        for(int i : list) {
            if(i % 2 == 0) even.add(i);
            else  odd.add(i);
        }
        Collections.sort(odd);
        even.sort(Collections.reverseOrder());
        System.out.println(odd);
        Collections.sort(even);
    }

    private static ArrayList<Integer> timSoNguyenTo(ArrayList<Integer> list) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int temp : list){
            if(isPrime(temp)) res.add(temp);
        }
        return res;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }


    private static void sumOddEven(ArrayList<Integer> list) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                sumEven += list.get(i);
            }else{
                sumOdd += list.get(i);
            }
        }
        System.out.println("Tổng các số lẻ là: " + sumOdd);
        System.out.println("Tổng các số chẵn là: " + sumEven);
    }
}
