package PatikaJava;

import java.util.Scanner;

public class Patika35 {

    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        inp.close();

        boolean asal = isPrime(n, 2);
        if (asal == true) {
            System.out.println(n + " asal bir sayıdır");
        } else {
            System.out.println(n + " asal bir sayı değildir");
        }
    }
}
