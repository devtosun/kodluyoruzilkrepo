package PatikaJava;

import java.security.DomainCombiner;
import java.util.Scanner;

public class PatikaJava7 {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        int armutKg = input.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        int elmaKg = input.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        int domatesKg = input.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        int muzKg = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        int patlicanKg = input.nextInt();

        input.close();

        double tutar = (armut * armutKg)  + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);
        System.out.println("Tutar : " + tutar);

    }
}
