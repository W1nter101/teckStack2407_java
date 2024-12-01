import java.util.Scanner;

public class buoi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap N: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap so thu " + (i+1) + " : ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        int sumRes = 0;
        for (int i = 0; i < n; i++) {
            sumRes += a[i];
        }
        System.out.println("sum result: " + sumRes);

        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < lowest) {
                lowest = a[i];
            }
            if (a[i] > highest) {
                highest = a[i];
            }
        }
        System.out.println("lowest: " + lowest);
        System.out.println("highest: " + highest);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
