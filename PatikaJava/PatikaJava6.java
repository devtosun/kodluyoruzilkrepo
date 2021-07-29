package PatikaJava;

import java.util.Scanner;

public class PatikaJava6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        int kilo = input.nextInt();
        input.close();
        double vki = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz : " + vki);
    }
}
