package PatikaJava;

import java.util.Scanner;

public class Patika21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        int n = input.nextInt();

        System.out.print("Kuvvet sayı : ");
        int k = input.nextInt();
        input.close();

        int sonuc = n;

        for (int i = 1; i < k; i++) {
            sonuc = sonuc*n;
        }
        System.out.println("İşlem sonucu = " + sonuc);
    }
}
