package PatikaJava;

import java.util.Scanner;

public class PatikaJava14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi kilometre türünden giriniz : ");
        int km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek yön, 2 => Gidiş dönüş) : ");
        int tip = input.nextInt();
        input.close();

        if (yas < 0 || km < 0 || (tip != 1 && tip != 2)){
            System.out.println("Hatalı giriş yaptınız!");
            System.exit(1);
        }

        double tutar = km * 0.10;

        if (yas < 12) {
            tutar = tutar * 0.5;
        }
        if (yas >= 12 && yas <= 24) {
            tutar = tutar * 0.9; 
        }
        if (yas > 65) {
            tutar = tutar * 0.7;
        }
        if  (tip == 2) {
            tutar = tutar * 0.8;
            tutar *= 2;
        }

        System.out.println("Bilet ücreti : " + tutar);        
    }
}
