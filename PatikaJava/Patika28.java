package PatikaJava;

import java.util.Scanner;

public class Patika28 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        inp.close();;

        int m = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) m += i;
        }
        if (m == n && n > 1) {
            System.out.println(n + " mükemmel bir sayıdır");
        } else {
            System.out.println(n + " mükemmel bir sayı değildir");
        }
    }
}
