package PatikaJava;

import java.util.Scanner;

public class PatikaJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. dik kenarı giriniz.");
        int a = input.nextInt();

        System.out.println("2. dik kenarı giriniz.");
        int b = input.nextInt();

        input.close();

        double hipotenus = Math.sqrt(a*a + b*b);

        System.out.println("Hipotenüs : " + hipotenus);
    }
}
