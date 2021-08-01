package PatikaJava;

import java.util.Scanner;

public class Patika20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üst küme eleman sayısı giriniz : ");
        long N = input.nextInt();

        System.out.print("Alt küme eleman sayısı giriniz :");
        long r = input.nextInt();
        input.close();

        if (r > N) {
            System.out.println("Alt küme, üst kümeden fazla olamaz.");
            System.exit(1);
        }

        System.out.println(faktoriyel(N));

        long c = faktoriyel(N) / (faktoriyel(r) * faktoriyel(N - r));
        System.out.println("Kombinasyon = " + c);

    }

    public static long faktoriyel(long f) {
        long fakt = 1;
        for (long i = 1; i <= f; i++) {
            fakt = fakt * i;
        }
        return fakt;
    }
}
