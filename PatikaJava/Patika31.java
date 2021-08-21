package PatikaJava;

import java.util.Scanner;

public class Patika31 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        inp.close();

        int fib = 0;
        int next = 1;
        int temp;
        System.out.print(n + " elemanlı fibonacci serisi : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib + " ");
            temp = fib;
            fib = next;
            next += temp;
        }
    }
}
