package PatikaJava;

import java.util.Scanner;

public class PatikaJava17 {
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir sayı girinizi : ");
        int sayi = input.nextInt();
        input.close();

        int toplam = 0;
        int adet = 0;
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                adet++;
            }
        }

        int sonuc = toplam / adet;
        System.out.println("Ortalama = " + sonuc);
    }
}