package PatikaJava;

import java.util.Scanner;

public class PatikaJava5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Dairenin yarı çapını giriniz.");
        int r = input.nextInt();
        input.close();

        System.out.println("Dairenin alanı : " + (pi * r*r));
        System.out.println("Dairenin çevresi : " + (2 * pi * r));
    }
}
