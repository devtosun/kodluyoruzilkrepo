package PatikaJava;

import java.util.Scanner;

public class PatikaJava2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fiyat giriniz :");
        int fiyat = input.nextInt();
        if (fiyat > 0 && fiyat <= 1000) {
            System.out.println("Kdv Tutarı : " + fiyat * 0.18);
            System.out.println("Kdv'li Tutar : " + fiyat * 1.18);
        } else if (fiyat > 1000) {
            System.out.println("Kdv Tutarı : " + fiyat * 0.08);
            System.out.println("Kdv'li Tutar : " + fiyat * 1.08);
        }
        input.close();
    }
}
