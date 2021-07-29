package PatikaJava;

import java.util.Scanner;

public class PatikaJava4 {
    public static void main(String[] args) {
        int acilisTutari = 10;
        double kmFiyati = 2.2;
        double km = 0.0;
        double toplamFiyat = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilometre mesafe alınmıştır?");
        km = input.nextDouble();
        input.close();

        toplamFiyat = acilisTutari + (km*kmFiyati);
        
        System.out.println("Taksi borcu : " + (toplamFiyat > 20 ? toplamFiyat : 20));
    }
}
