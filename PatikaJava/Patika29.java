package PatikaJava;

import java.util.Scanner;

public class Patika29 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int n = inp.nextInt();
        inp.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((n-i)*2)+1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
