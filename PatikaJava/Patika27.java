package PatikaJava;

import java.util.Scanner;

public class Patika27 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = inp.nextInt();

        int min = 0;
        int max = 0;
        int next = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". sayıyı giriniz : ");
            if (i == 0) {
                min = inp.nextInt();
                max = min;
            } else {
                next = inp.nextInt();
                if (next < min) min = next;
                if (next > max) max = next;
            }    
        }
        inp.close();
        
        System.out.println("En küçük sayı : " + min);
        System.out.println("En büyük sayı : " + max);
    }
}
