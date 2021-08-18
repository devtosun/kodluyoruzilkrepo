package PatikaJava;

import java.util.Scanner;

public class Patika23 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        int n = inp.nextInt();
        inp.close();

        double toplam = 0.0;

        for (double i = 1; i <= n; i++) {
            toplam += 1/i;
        }
        System.out.println("Harmonik seri = " + toplam);

    }
}
