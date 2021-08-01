package PatikaJava;

import java.util.Scanner;

public class Patika18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int n;

        do {
            System.out.print("Bir sayı giriniz : ");
            n = input.nextInt();
            if (n % 4 == 0) {
                toplam += n;
            }
        } while (n > 0);

        input.close();
        System.out.println("Toplam = " + toplam);
    }
}
