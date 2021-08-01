package PatikaJava;

import java.util.Scanner;

public class Patika19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();
        input.close();

        for (int i = 1; i < sayi; i*=4) {
            if (i < sayi){
                System.out.println(i + " 4'ün kuvvetidir.");
            }    
        }
        for (int i = 1; i < sayi; i*=5) {
            if (i < sayi){
                System.out.println(i + " 5'in kuvvetidir.");
            }    
        }
    }
}
